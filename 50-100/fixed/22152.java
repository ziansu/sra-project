@org.junit.Test
public void testDateOK() throws java.lang.Throwable {
    java.util.Map<java.lang.String, java.lang.Object> dataset = new java.util.HashMap<>();
    dataset.put("issued", "2017-12-31");
    dataset.put("modified", "2017-12-31T14:22:00");
    org.springframework.http.ResponseEntity<no.dcat.validation.model.Validation> actualResponse = controller.validateDataset(dataset, "");
    assertThat(actualResponse.getStatusCode(), is(HttpStatus.OK));
    assertThat("errors", actualResponse.getBody().getErrors(), is(0));
}