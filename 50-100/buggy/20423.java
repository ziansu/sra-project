@org.junit.Test
public void testDateNotOK() throws java.lang.Throwable {
    java.util.Map<java.lang.String, java.lang.Object> dataset = new java.util.HashMap<>();
    dataset.put("issued", "2017-15-33");
    dataset.put("modified", "2017-12-30T26:90");
    org.springframework.http.ResponseEntity<no.dcat.validation.model.Validation> actualResponse = controller.validateDataset(dataset, "");
    org.junit.Assert.assertThat(actualResponse.getStatusCode(), org.hamcrest.Matchers.is(HttpStatus.OK));
    org.junit.Assert.assertThat("errors", actualResponse.getBody().getErrors(), org.hamcrest.Matchers.is(2));
}