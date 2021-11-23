@java.lang.Override
public R withName(java.lang.String name) {
    try {
        return ((R) (getClass().getConstructor(clientType, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class).newInstance(client, namespace, name, cascading)));
    } catch (java.lang.Throwable t) {
        throw io.fabric8.kubernetes.client.KubernetesClientException.launderThrowable(t);
    }
}