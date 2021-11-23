@org.springframework.context.annotation.Bean
@org.springframework.boot.autoconfigure.condition.ConditionalOnClass(name = "com.netflix.zuul.ZuulFilter")
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(value = org.onetwo.cloud.core.BootJfishCloudConfig.ZUUL_FIXHEADERS_ENABLED)
@org.springframework.cloud.context.config.annotation.RefreshScope
public org.onetwo.cloud.zuul.FixHeaderZuulFilter fixHeaderZuulFilter() {
    org.onetwo.cloud.zuul.FixHeaderZuulFilter filter = new org.onetwo.cloud.zuul.FixHeaderZuulFilter();
    filter.setFixHeaders(cloudConfig.getZuul().getFixHeaders());
    return filter;
}