@org.testng.annotations.Test(dataProvider = "address output for combined XML")
public void testCombinedAddresses(java.lang.String id, java.lang.String address) {
    org.testng.Assert.assertEquals(parsedCompanies.get(id).getAddress(), address);
}