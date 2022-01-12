public static java.lang.String reportLinkPrefix() {
    if (se.claremont.autotest.common.TestRun.settings.getCustomValue("HtmlReportsLinkPrefix").toLowerCase().contains("http")) {
        return "http";
    }else
        if (se.claremont.autotest.common.TestRun.settings.getCustomValue("HtmlReportsLinkPrefix").toLowerCase().contains("https")) {
            return "https";
        }
    
    return "file";
}