@org.springframework.web.bind.annotation.RequestMapping(value = "/{productId}/invoice", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.data.domain.Page<com.cspinformatique.kubik.model.sales.InvoiceDetail> findProductInvoices(@org.springframework.web.bind.annotation.PathVariable(value = "productId")
int productId, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "0")
java.lang.Integer page, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "10")
java.lang.Integer resultPerPage, @org.springframework.web.bind.annotation.RequestParam(required = false)
org.springframework.data.domain.Sort.Direction direction, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "extendedLabel")
java.lang.String sortBy) {
    return this.invoiceDetailService.findByProductAndInvoiceStatus(this.productService.findOne(productId), new com.cspinformatique.kubik.model.sales.InvoiceStatus(InvoiceStatus.Types.PAID.name(), null), new org.springframework.data.domain.PageRequest(page, resultPerPage, (direction != null ? direction : org.springframework.data.domain.Sort.Direction.ASC), sortBy));
}