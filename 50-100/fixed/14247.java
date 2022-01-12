@java.lang.Override
public java.util.function.Function<io.gravitee.gateway.api.buffer.Buffer, io.gravitee.gateway.api.buffer.Buffer> transform() throws io.gravitee.gateway.api.stream.exception.TransformationException {
    return ( buffer) -> {
        executionContext.getTemplateEngine().getTemplateContext().setVariable("request", new io.gravitee.policy.rest2soap.el.ContentAwareEvaluableRequest(request, buffer.toString()));
        java.lang.String soapEnvelope = executionContext.getTemplateEngine().convert(soapTransformerPolicyConfiguration.getEnvelope());
        return io.gravitee.gateway.api.buffer.Buffer.buffer(soapEnvelope);
    };
}