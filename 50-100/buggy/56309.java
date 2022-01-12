public byte[] getReportFile() {
    org.jevis.api.JEVisFile template = reportProperty.getTemplate();
    org.jevis.report3.TemplateTransformator transformator = new org.jevis.report3.TemplateTransformator();
    org.jxls.common.Context context = new org.jxls.common.Context(contextMap);
    try {
        transformator.transfrom(template.getBytes(), context);
    } catch (java.io.IOException ex) {
        org.jevis.report3.data.report.Report.logger.error("error while transformatin of the template", ex);
    }
    return transformator.getOutputBytes();
}