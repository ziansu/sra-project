@java.lang.Override
public org.apache.jmeter.report.processor.ResultData customizeResult(org.apache.jmeter.report.processor.ResultData result) {
    org.apache.jmeter.report.processor.MapResultData customizedResult = new org.apache.jmeter.report.processor.MapResultData();
    customizedResult.setResult(org.apache.jmeter.report.dashboard.HtmlTemplateExporter.DATA_CTX_RESULT, result);
    if ((extraOptions) != null) {
        org.apache.jmeter.report.processor.MapResultData extraResult = new org.apache.jmeter.report.processor.MapResultData();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> extraEntry : extraOptions.getProperties().entrySet()) {
            extraResult.setResult(extraEntry.getKey(), new org.apache.jmeter.report.processor.ValueResultData(extraEntry.getValue()));
        }
        customizedResult.setResult(org.apache.jmeter.report.dashboard.HtmlTemplateExporter.DATA_CTX_EXTRA_OPTIONS, extraResult);
    }
    return customizedResult;
}