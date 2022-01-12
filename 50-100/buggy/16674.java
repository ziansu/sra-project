private io.fabric8.kubernetes.client.KubernetesClient buildKubernetesClient(java.lang.String apiToken, java.lang.String kubernetesMaster) {
    java.lang.String oauthToken = apiToken;
    if (com.hazelcast.util.StringUtil.isNullOrEmpty(oauthToken)) {
        oauthToken = getAccountToken();
    }
    logger.info((("Kubernetes Discovery: Bearer Token { " + apiToken) + " }"));
    io.fabric8.kubernetes.client.Config config = new io.fabric8.kubernetes.client.ConfigBuilder().withOauthToken(oauthToken).withMasterUrl(kubernetesMaster).build();
    return new io.fabric8.kubernetes.client.DefaultKubernetesClient(config);
}