@org.junit.Test
public void successfulGet() throws java.lang.Exception {
    com.springernature.watermark.api.WatermarkApiIntegrationTest.LOG.info("Testing successfulGet");
    com.springernature.watermark.model.Book book = com.springernature.watermark.model.ModelTestUtil.createDummyBook();
    java.lang.Long id = postRequest(book);
    com.springernature.watermark.api.RequestEntity entity = com.springernature.watermark.api.RequestEntity.get(new java.net.URI((((baseUrl) + "/") + id))).build();
    com.springernature.watermark.api.ResponseEntity<java.util.Map> response = this.testRestTemplate.exchange(entity, java.util.Map.class);
    assertEquals(HttpStatus.OK, response.getStatusCode());
}