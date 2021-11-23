public void contextInitialized(javax.servlet.ServletContextEvent servletContextEvent) {
    com.jlfex.hermes.common.Logger.info("开始初始化中金支付环境");
    try {
        java.lang.String path = (java.lang.Class.class.getClass().getResource("/").getPath()) + (com.jlfex.hermes.main.cfca.init.CFCAPaymentInitListener.PAYMENT_CONFIG_PATH);
        cfca.payment.api.system.PaymentEnvironment.initialize(path);
    } catch (java.lang.Exception e) {
        com.jlfex.hermes.common.Logger.error("初始化中金支付环境异常:", e);
    }
    com.jlfex.hermes.common.Logger.info("初始化中金支付环境完毕");
}