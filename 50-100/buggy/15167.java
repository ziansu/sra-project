@java.lang.Override
protected void configureServer() {
    bind(com.github.diegopacheco.sandbox.java.netflixoss.msa.AuthenticationService.class).to(com.github.diegopacheco.sandbox.java.netflixoss.msa.AuthenticationServiceImpl.class);
    interceptorSupport().forUri("/*").intercept(com.github.diegopacheco.sandbox.java.netflixoss.msa.LoggingInterceptor.class);
    interceptorSupport().forUri("/cache/*").interceptIn(com.github.diegopacheco.sandbox.java.netflixoss.msa.AuthInterceptor.class);
    interceptorSupport().forUri("/cache/").intercept(com.github.diegopacheco.sandbox.java.netflixoss.msa.AWSXrayInterceptor.class);
    server().port(6002).threadPoolSize(400);
}