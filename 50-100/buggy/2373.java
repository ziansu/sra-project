@java.lang.Override
public io.fabric8.kubernetes.client.dsl.EditReplaceDeletable<T, T, D, java.lang.Boolean> cascading(boolean enabled) {
    try {
        return getClass().getConstructor(clientType, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class).newInstance(client, namespace, name, enabled);
    } catch (java.lang.Throwable t) {
        throw io.fabric8.kubernetes.client.KubernetesClientException.launderThrowable(t);
    }
}