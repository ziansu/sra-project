@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String mainPage(org.springframework.ui.ModelMap modelMap, javax.servlet.http.HttpServletRequest request) {
    addCommonModelMapData(modelMap);
    return "time";
}