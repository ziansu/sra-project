@org.springframework.web.bind.annotation.RequestMapping(value = "/customer/createcustomerpage", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getCreateCustomerPage(final org.springframework.ui.Model model, @org.springframework.web.bind.annotation.ModelAttribute(value = "message")
final java.lang.String message, final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response) {
    fillSourceInModel(model);
    fillAddressInModel(model, null);
    return ControllerConstants.LTE.CREATECUSTOMERPAGE;
}