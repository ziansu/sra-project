@org.junit.Before
public void setUp() {
    context = new org.springframework.context.annotation.AnnotationConfigApplicationContext(com.poc.mongodbredisintegration.config.CustomCacheErrorHandlerTest.Config.class);
    this.cache = context.getBean("mockCache", org.springframework.cache.Cache.class);
    this.cacheInterceptor = context.getBean(org.springframework.cache.interceptor.CacheInterceptor.class);
    context.getBean(com.poc.mongodbredisintegration.config.CustomCacheErrorHandler.class);
    this.simpleService = context.getBean(com.poc.mongodbredisintegration.config.CustomCacheErrorHandlerTest.SimpleService.class);
}