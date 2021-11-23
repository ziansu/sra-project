private boolean isDelay() {
    java.lang.Integer delay = com.alibaba.dubbo.config.spring.ServiceBean.getDelay();
    com.alibaba.dubbo.config.ProviderConfig provider = com.alibaba.dubbo.config.spring.ServiceBean.getProvider();
    if ((delay == null) && (provider != null)) {
        delay = provider.getDelay();
    }
    return (supportedApplicationListener) && ((delay == null) || ((delay.intValue()) == (-1)));
}