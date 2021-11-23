@org.springframework.web.bind.annotation.RequestMapping(value = "/reports", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String search(@org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.String search, org.springframework.ui.Model uiModel) {
    buildListReport(search, uiModel);
    return "reports/list";
}