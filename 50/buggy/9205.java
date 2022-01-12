@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteInv")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String deleteInv(@org.springframework.web.bind.annotation.RequestBody
com.webapp.project.modules.invoice.model.InvoiceVoucher[] invoiceVoucher) {
    java.lang.String a = "test";
    invoiceService.deleteInv(invoiceVoucher);
    return "success";
}