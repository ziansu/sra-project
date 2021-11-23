@org.junit.Before
public final void getRecords() throws java.io.IOException, org.apache.http.client.ClientProtocolException {
    HEAD records = vk.getNewRecords();
    records = vk.getNewRecordsByTag("ДобраеСэрца");
}