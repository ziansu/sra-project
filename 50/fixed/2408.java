protected void validateMessageHeader(org.springframework.integration.MessageHeaders controlHeaders, org.springframework.integration.MessageHeaders receivedHeaders, com.consol.citrus.context.TestContext context) {
    com.consol.citrus.validation.ControlMessageValidator validatorDelegate = new com.consol.citrus.validation.ControlMessageValidator();
    validatorDelegate.validateMessageHeader(controlHeaders, receivedHeaders, context);
}