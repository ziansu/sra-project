@java.lang.Override
public io.fabric8.kubernetes.client.dsl.NamespaceVisitFromServerGetDeleteRecreateApplicable<java.util.List<io.fabric8.kubernetes.api.model.HasMetadata>, java.lang.Boolean> resource(io.fabric8.kubernetes.api.model.HasMetadata item) {
    return new io.fabric8.kubernetes.client.dsl.internal.NamespaceVisitFromServerGetDeleteRecreateApplicableImpl(httpClient, getConfiguration(), getNamespace(), false, false, new java.util.ArrayList<io.fabric8.kubernetes.api.builder.Visitor>(), item, (-1)) {    };
}