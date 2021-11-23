@java.lang.Override
public org.apache.logging.log4j.message.Message newMessage(final java.lang.String message, final java.lang.Object... params) {
    org.apache.logging.log4j.message.ReusableParameterizedMessage result = org.apache.logging.log4j.message.ReusableParameterizedMessageFactory.threadLocalMessage.get();
    if (result == null) {
        result = new org.apache.logging.log4j.message.ReusableParameterizedMessage();
        org.apache.logging.log4j.message.ReusableParameterizedMessageFactory.threadLocalMessage.set(result);
    }
    result.set(message, params);
    return result;
}