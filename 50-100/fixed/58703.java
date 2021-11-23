@java.lang.Override
public io.fabric8.kubernetes.client.dsl.ClientNonNamespaceOperation<K, T, L, D, R> inNamespace(java.lang.String namespace) {
    try {
        return getClass().getConstructor(clientType, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, type).newInstance(client, namespace, name, cascading, item);
    } catch (java.lang.Throwable t) {
        throw io.fabric8.kubernetes.client.KubernetesClientException.launderThrowable(t);
    }
}