@org.junit.Before
public void initialize() throws java.lang.Exception {
    context = new payne.framework.pigeon.server.bio.BlockingInvocationContext();
    context.bind(9090);
    context.register(new payne.framework.pigeon.sample.encryption.EncryptedAPIImpl());
    context.startup();
    payne.framework.pigeon.client.Client client = new payne.framework.pigeon.client.Client("localhost", 9090, "pigeon.properties", "rsa-public.properties");
    api = client.create("HTTP/1.1", "application/x-java-serialized-object", "/EncryptedAPIImpl", payne.framework.pigeon.sample.encryption.EncryptedAPI.class);
}