@org.junit.Test
public void successfulHead() throws java.lang.Exception {
    com.springernature.watermark.api.WatermarkApiIntegrationTest.LOG.info("Testing successfulHead");
    com.springernature.watermark.model.Book book = com.springernature.watermark.model.ModelTestUtil.createDummyBook();
    java.lang.Long id = postRequest(book);
    java.lang.Thread.yield();
    com.springernature.watermark.api.RequestEntity entity = com.springernature.watermark.api.RequestEntity.head(new java.net.URI((((baseUrl) + "/") + id))).build();
    com.springernature.watermark.api.ResponseEntity<java.util.Map> response = this.testRestTemplate.exchange(entity, java.util.Map.class);
    assertEquals(HttpStatus.CREATED, response.getStatusCode());
}