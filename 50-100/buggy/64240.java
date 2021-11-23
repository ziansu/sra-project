public void on(io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder builder) {
    io.fabric8.kubernetes.api.model.PodSpec podSpec = new io.fabric8.kubernetes.api.model.PodSpecBuilder(builder.getSpec()).addNewContainer().withName("logstash-template").withImage(((((java.lang.System.getProperty("fabric8.dockerPrefix", "docker.io/")) + (java.lang.System.getProperty("fabric8.dockerUser", "fabric8/"))) + "elasticsearch-logstash-template:") + (java.lang.System.getProperty("project.version")))).endContainer().build();
    builder.withSpec(podSpec);
}