@java.lang.SuppressWarnings(value = "unchecked")
public <C extends org.springframework.security.config.annotation.SecurityConfigurerAdapter<O, B>> C apply(C configurer) throws java.lang.Exception {
    configurer.addObjectPostProcessor(objectPostProcessor);
    configurer.setBuilder(((B) (this)));
    add(configurer);
    return configurer;
}