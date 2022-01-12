public java.util.List<br.com.moip.resource.Invoice> list() {
    return client.get("/v2/invoices", new java.util.ArrayList<br.com.moip.resource.Invoice>().getClass());
}