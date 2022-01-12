public java.lang.String getFreemakerTemplate(java.util.HashMap<java.lang.String, java.lang.Object> model) {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    try {
        buf.append(org.springframework.ui.freemarker.FreeMarkerTemplateUtils.processTemplateIntoString(freemarkerConfiguration.getTemplate("fm_template.txt"), buf));
        return buf.toString();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("Exception occured while processing fmtemplate: " + (e.getMessage())));
    }
    return "";
}