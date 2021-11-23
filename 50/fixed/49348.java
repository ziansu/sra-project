public void setServiceName(java.lang.String svcName) {
    this.serviceName = svcName;
    this.testSqlTextArea.setText(Constants.BLANK);
    updateStatus();
}