@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    java.util.Map<java.lang.String, org.springframework.validation.Validator> validators = beanFactory.getBeansOfType(org.springframework.validation.Validator.class);
    for (java.util.Map.Entry<java.lang.String, org.springframework.validation.Validator> entry : validators.entrySet()) {
        com.baeldung.config.ValidatorEventRegister.EVENTS.stream().filter(( p) -> entry.getKey().startsWith(p)).findFirst().ifPresent(( p) -> validatingRepositoryEventListener.addValidator(p, entry.getValue()));
    }
}