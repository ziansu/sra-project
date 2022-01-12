@org.junit.Test
public void verifyDeleteServiceNoService() throws java.lang.Exception {
    final org.springframework.mock.web.MockHttpServletResponse response = new org.springframework.mock.web.MockHttpServletResponse();
    final org.springframework.http.ResponseEntity entity = this.controller.deleteRegisteredService(5000);
    assertNull(this.servicesManager.findServiceBy(5000));
    assertFalse(response.getContentAsString().contains("serviceName"));
    assertFalse(entity.getStatusCode().is2xxSuccessful());
}