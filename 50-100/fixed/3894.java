@org.junit.Test
public void compressedResponse() {
    final java.util.List<org.springframework.cloud.netflix.feign.encoding.app.domain.Invoice> invoices = org.springframework.cloud.netflix.feign.encoding.Invoices.createInvoiceList(50);
    final org.springframework.http.ResponseEntity<java.util.List<org.springframework.cloud.netflix.feign.encoding.app.domain.Invoice>> response = this.invoiceClient.saveInvoices(invoices);
    org.junit.Assert.assertNotNull(response);
    org.junit.Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
    org.junit.Assert.assertNotNull(response.getBody());
    org.junit.Assert.assertEquals(invoices.size(), response.getBody().size());
}