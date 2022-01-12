private void initializeWhydahApplicationSession() {
    net.whydah.sso.WhydahApplicationSession.log.info("Initializing new application session");
    applicationTokenXML = net.whydah.sso.WhydahUtil.logOnApplication(sts, appId, appSecret);
    if (((applicationTokenXML) == null) || ((applicationTokenXML.length()) < 4)) {
        net.whydah.sso.WhydahApplicationSession.log.error(("Error, unable to initialize new application session, applicationTokenXml:" + (applicationTokenXML)));
    }else {
        net.whydah.sso.WhydahApplicationSession.log.info(("Initializing new application session, applicationTokenXml:" + (applicationTokenXML)));
        applicationTokenId = net.whydah.sso.application.ApplicationXpathHelper.getAppTokenIdFromAppTokenXml(applicationTokenXML);
    }
}