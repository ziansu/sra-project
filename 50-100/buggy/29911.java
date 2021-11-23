public void buttonAction(java.lang.String serialNumber) {
    if ((null != (pDownload)) && (null != (rdl))) {
        pDownload.setDownloadFileNamePrefix(serialNumber);
        rdl.serialPrefix = serialNumber.charAt(0);
        rdl.serialNumber = java.lang.Integer.parseInt(serialNumber.substring(1));
        pDownload.bDownload.setEnabled(true);
    }
}