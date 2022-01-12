@org.springframework.context.annotation.Bean
public org.springframework.context.support.ResourceBundleMessageSource messageSource() {
    org.springframework.context.support.ResourceBundleMessageSource messageSource = new org.springframework.context.support.ResourceBundleMessageSource();
    messageSource.setDefaultEncoding("UTF-8");
    return messageSource;
}