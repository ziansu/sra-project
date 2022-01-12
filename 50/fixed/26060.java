@org.springframework.context.annotation.Bean
io.fabric8.kubernetes.client.KubernetesClient kubernetesClient() {
    return new io.fabric8.kubernetes.client.DefaultKubernetesClient();
}