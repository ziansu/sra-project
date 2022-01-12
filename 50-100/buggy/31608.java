public static void setDataVerificationSignature() {
    java.util.Properties pm;
    try {
        pm = com.sudolink.isp.app.PropertiesManager.getInstance();
        java.lang.String md5 = com.sudolink.isp.app.Application.calculateDataVerificationSignature();
        pm.setProperty(PropertiesManager.DATA_INTEGRITY_SIGNATURE, md5);
        com.sudolink.isp.app.PropertiesManager.commit();
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(com.sudolink.isp.app.Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}