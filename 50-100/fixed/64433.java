private void send(org.eclipse.kapua.gateway.client.Payload.Builder payload, java.lang.String mainTopic, java.lang.String... subCategories) {
    if ((payload.values().size()) > 0) {
        try {
            application.data(org.eclipse.kapua.gateway.client.Topic.of(mainTopic, subCategories)).send(payload);
        } catch (java.lang.Exception e) {
        }
    }
}