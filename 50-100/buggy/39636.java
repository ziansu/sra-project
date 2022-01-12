public void login() {
    this.m_isLoggedIn = true;
    try {
        sendRequest(null, TTalkMessageType.LOGIN.getValue());
    } catch (il.ac.technion.cs.sd.msg.MessengerException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}