@org.springframework.context.annotation.Bean
public org.springframework.beans.factory.FactoryBean<java.util.Properties> dynamicProperties() {
    final java.lang.String defLang = java.util.Locale.getDefault().getLanguage();
    org.springframework.beans.factory.config.PropertiesFactoryBean factoryBean = new org.springframework.beans.factory.config.PropertiesFactoryBean();
    factoryBean.setIgnoreResourceNotFound(true);
    factoryBean.setLocations(new org.springframework.core.io.ClassPathResource("/yamj3-core-dynamic.properties"));
    factoryBean.setLocations(new org.springframework.core.io.ClassPathResource((("/yamj3-core-dynamic." + defLang) + ".properties")));
    return factoryBean;
}