private void checkNewScanId() {
    try {
        int newScanId = java.lang.Integer.parseInt(scanIdInput.getText());
        if (newScanId != (scanId)) {
            scanId = newScanId;
            ru.spbau.bioinf.tagfinder.Scan scan = scans.get(scanId);
            if (scan != null) {
                needUpdate.compareAndSet(false, scanView.setScan(scan));
                update();
            }
        }
    } catch (java.lang.NumberFormatException e) {
    }
}