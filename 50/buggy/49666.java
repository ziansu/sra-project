@org.springframework.web.bind.annotation.RequestMapping(value = "/supplier")
public java.lang.String displaySupplierDashboard(org.springframework.ui.ModelMap model) {
    java.lang.Long supplierId = userService.getLoggedInUser().getId();
    model.addAttribute("orders", orderService.getAllRequestedOrderForSupplierId(supplierId));
    return "supplier";
}