@java.lang.Override
@java.lang.SuppressWarnings(value = "deprecation")
public org.springframework.messaging.support.ErrorMessage buildErrorMessage(java.lang.Throwable throwable, org.springframework.core.AttributeAccessor attributes) {
    java.lang.Object inputMessage = attributes.getAttribute(ErrorMessageUtils.INPUT_MESSAGE_CONTEXT_KEY);
    return inputMessage instanceof org.springframework.messaging.Message ? new org.springframework.integration.support.EnhancedErrorMessage(((org.springframework.messaging.Message<?>) (inputMessage)), throwable) : new org.springframework.messaging.support.ErrorMessage(throwable);
}