public hudson.util.FormValidation doTestConnection(@org.kohsuke.stapler.QueryParameter
java.net.URL serverUrl, @org.kohsuke.stapler.QueryParameter
java.lang.String username, @org.kohsuke.stapler.QueryParameter
java.lang.String password) throws com.github.kubernetes.java.client.exceptions.KubernetesClientException, java.net.URISyntaxException {
    com.github.kubernetes.java.client.v2.RestFactory factory = new com.github.kubernetes.java.client.v2.RestFactory(org.csanchez.jenkins.plugins.kubernetes.KubernetesCloud.class.getClassLoader());
    com.github.kubernetes.java.client.interfaces.KubernetesAPIClientInterface client = new com.github.kubernetes.java.client.v2.KubernetesApiClient(serverUrl.toString(), username, password, factory);
    client.getAllPods();
    return hudson.util.FormValidation.ok("Connection successful");
}