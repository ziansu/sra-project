@org.testng.annotations.BeforeClass
public void setUp() {
    client = com.vk.api.sdk.httpclient.HttpTransportClient.getInstance();
    vk = new com.vk.api.sdk.client.VkApiClient(client, new com.google.gson.Gson());
}