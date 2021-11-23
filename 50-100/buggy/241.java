@org.springframework.web.bind.annotation.RequestMapping(value = { "/CreditView" })
public java.lang.String home(@org.springframework.web.bind.annotation.RequestParam(value = "data")
java.lang.String data, org.springframework.ui.ModelMap modelMap, java.util.Locale loc) {
    log.info("Home Page!!");
    if (!(handleRequestData(data, modelMap))) {
        addErrorMessage(modelMap, "error_general_error_message", null);
        return PAGE_ERROR;
    }else {
        return ("redirect:/index?lang=" + (this.language)) + "&redirect=1";
    }
}