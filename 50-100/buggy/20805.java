@org.junit.Test
public void It_returns_null_if_the_vin_does_not_exist() throws java.lang.Exception {
    final java.lang.String vinCode = "NON_EXISTING_ID";
    this.server.expect(org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo(("/parts/" + vinCode))).andRespond(org.springframework.test.web.client.response.MockRestResponseCreators.withStatus(HttpStatus.NOT_FOUND));
    java.util.Map<java.lang.String, java.lang.Object> actualPartData = partRestServiceProxy.getPartData(vinCode);
    assertNull("Part must not exist", actualPartData);
}