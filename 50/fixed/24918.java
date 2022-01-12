@org.springframework.context.annotation.Bean
public org.springframework.context.MessageSource messageSource() {
    org.springframework.context.support.ResourceBundleMessageSource messageSource = new org.springframework.context.support.ResourceBundleMessageSource();
    messageSource.setBasename("messages");
    return messageSource;
}