void handleLoginResult(com.sun.mail.imap.protocol.Response r) throws com.sun.mail.imap.protocol.ProtocolException {
    if ((hasCapability("LOGIN-REFERRALS")) && ((!(r.isOK())) || (referralException)))
        checkReferral(r);
    
    super.handleResult(r);
}