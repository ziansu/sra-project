private static void stopMessaging() throws java.lang.Exception {
    org.wso2.andes.kernel.Andes.getInstance().stopMessageExpirationWorker();
    org.wso2.andes.kernel.Andes.getInstance().stopMessageDelivery();
}