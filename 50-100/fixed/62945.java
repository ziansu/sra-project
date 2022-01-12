@java.lang.Override
public void apply(springfox.documentation.spi.service.contexts.OperationContext context) {
    java.lang.String operationName = context.getHandlerMethod().getMethod().getName();
    context.operationBuilder().method(context.httpMethod()).uniqueId(java.lang.String.format("%sUsing%s", operationName, context.httpMethod())).position(context.operationIndex()).summary(operationName);
}