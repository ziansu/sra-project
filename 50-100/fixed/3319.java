@org.junit.Test
@lombok.SneakyThrows
public void test_remote() {
    com.asterisk.akka.intergation.client.Client client = new com.asterisk.akka.intergation.client.Client("127.0.0.1:2552");
    client.set("123", 123);
    java.lang.String result = ((java.lang.String) (((java.util.concurrent.CompletableFuture) (client.get("123"))).get()));
    org.junit.Assert.assertEquals(result, java.lang.String.valueOf(123));
}