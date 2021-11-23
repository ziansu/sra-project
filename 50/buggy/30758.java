public br.com.moip.resource.Invoice create(final br.com.moip.request.InvoiceRequest invoice) {
    br.com.moip.resource.Invoice createdInvoice = client.post("/v2/invoices", invoice, br.com.moip.resource.Invoice.class);
    return createdInvoice;
}