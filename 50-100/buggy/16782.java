@io.gravitee.policy.api.annotations.OnRequestContent
public io.gravitee.gateway.api.stream.ReadWriteStream onRequestContent(io.gravitee.gateway.api.Request request, io.gravitee.gateway.api.ExecutionContext executionContext) {
    if ((jsonToJsonTransformationPolicyConfiguration.getScope()) == (io.gravitee.policy.json2json.configuration.PolicyScope.REQUEST)) {
        return io.gravitee.gateway.api.http.stream.TransformableRequestStreamBuilder.on(request).contentType(MediaType.APPLICATION_JSON).transform(map(executionContext)).build();
    }else {
        return new io.gravitee.gateway.api.stream.BufferedReadWriteStream();
    }
}