@java.lang.Override
public void postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory beanFactory) throws org.springframework.beans.BeansException {
    com.baidu.disconf.client.DisconfMgr.firstScan(scanPackage);
}