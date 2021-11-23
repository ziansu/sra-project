@java.lang.SuppressWarnings(value = "unchecked")
public <C extends org.springframework.security.config.annotation.SecurityConfigurerAdapter<O, B>> C apply(C configurer) throws java.lang.Exception {
    add(configurer);
    configurer.addObjectPostProcessor(objectPostProcessor);
    configurer.setBuilder(((B) (this)));
    return configurer;
}