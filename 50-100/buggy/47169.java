public java.lang.String getHostKey() {
    final java.lang.String hostKey = sessionPO.getHostKey();
    if (org.adempiere.ad.session.MFSession.HOSTKEY_NOT_YET_DETERMINED.equals(hostKey)) {
        final de.metas.hostkey.api.IHostKeyBL hostKeyBL = org.adempiere.util.Services.get(de.metas.hostkey.api.IHostKeyBL.class);
        final java.lang.String newHostKey = hostKeyBL.getCreateHostKey();
        org.adempiere.ad.session.MFSession.log.info("Setting AD_Session.HostKey={} for sessionPO={}", hostKey, sessionPO);
        sessionPO.setHostKey(newHostKey);
        org.adempiere.model.InterfaceWrapperHelper.save(sessionPO);
    }
    return hostKey;
}