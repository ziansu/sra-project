@org.springframework.context.annotation.Lazy
@org.springframework.context.annotation.Bean
public org.springframework.cache.ehcache.EhCacheManagerFactoryBean cacheManager() {
    final org.springframework.cache.ehcache.EhCacheManagerFactoryBean bean = new org.springframework.cache.ehcache.EhCacheManagerFactoryBean();
    bean.setConfigLocation(casProperties.getTicket().getRegistry().getEhcache().getConfigLocation());
    bean.setShared(casProperties.getTicket().getRegistry().getEhcache().isShared());
    bean.setCacheManagerName(casProperties.getTicket().getRegistry().getEhcache().getCacheManagerName());
    return bean;
}