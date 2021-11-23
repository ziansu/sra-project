public void createBye() {
    try {
        if ((this.getDialog()) != null) {
            javax.sip.message.Request byeRequest = this.getDialog().createRequest(Request.BYE);
            java.lang.System.out.println(("CREATE BYE REQUEST ->" + byeRequest));
            sipConnector.sendRequest(byeRequest, this);
        }
    } catch (javax.sip.SipException ex) {
        com.dialogic.msmltool.Call.logger.log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
    }
}