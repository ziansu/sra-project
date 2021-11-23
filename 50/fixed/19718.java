@java.lang.Override
public void setSendTimeout(long sendTimeout) {
    super.setSendTimeout(sendTimeout);
    setSendTimeoutExpression(new org.springframework.integration.expression.ValueExpression(sendTimeout));
}