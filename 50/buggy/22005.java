public static void startMessaging() throws java.lang.Exception {
    org.wso2.andes.kernel.Andes.getInstance().startMessageDelivery();
    org.wso2.andes.kernel.Andes.getInstance().startMessageExpirationWorker();
}