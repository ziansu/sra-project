public static java.lang.String format(final java.lang.String messagePattern, final java.lang.Object[] arguments) {
    final java.lang.StringBuilder result = org.apache.logging.log4j.message.ParameterizedMessage.getThreadLocalStringBuilder();
    final int argCount = (arguments == null) ? 0 : arguments.length;
    org.apache.logging.log4j.message.ParameterizedMessage.formatMessage(result, messagePattern, arguments, argCount);
    return result.toString();
}