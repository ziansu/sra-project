@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    for (java.util.Map.Entry<java.lang.String, org.springframework.validation.Validator> entry : validators.entrySet()) {
        com.baeldung.config.ValidatorEventRegister.EVENTS.stream().filter(( p) -> entry.getKey().startsWith(p)).findFirst().ifPresent(( p) -> validatingRepositoryEventListener.addValidator(p, entry.getValue()));
    }
}