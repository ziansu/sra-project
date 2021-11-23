@org.junit.Before
public void setup() {
    client = new com.coupa.api.impl.JerseyClient(java.lang.System.getenv("coupaHost"), java.lang.System.getenv("coupaKey"));
    userRepo = com.coupa.api.impl.DefaultRepository.newRepository(client, com.coupa.resources.User.class);
}