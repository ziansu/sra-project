@org.junit.Test
public void testGetNetworkIdByType() throws java.lang.Exception {
    conversionTable.addEntryConnectionType("NetworkId", "original");
    java.lang.String result = target.getNetworkIdByType("original");
    org.junit.Assert.assertThat(result, org.hamcrest.CoreMatchers.is("NetworkId"));
}