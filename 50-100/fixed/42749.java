@org.springframework.web.bind.annotation.RequestMapping(value = "/reports/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String insert(@org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.String substring, java.lang.String content, org.springframework.ui.Model uiModel) {
    if ((org.springframework.util.StringUtils.isEmpty(content)) || (org.springframework.util.StringUtils.isEmpty(content.trim()))) {
        return "reports/add";
    }
    reportDao.insert(content);
    buildListReport(substring, uiModel);
    return "reports/list";
}