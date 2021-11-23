private void checkNewScanId() {
    try {
        int newScanId = java.lang.Integer.parseInt(scanIdInput.getText());
        ru.spbau.bioinf.tagfinder.Scan scan = scans.get(newScanId);
        if (scan != null) {
            if (newScanId != (scanId)) {
                scanId = newScanId;
                needUpdate.compareAndSet(false, scanView.setScan(scan));
                update();
            }
        }
    } catch (java.lang.NumberFormatException e) {
    }
}