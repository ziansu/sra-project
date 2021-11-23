public static gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.lang.String fname) {
    return gr.ntua.ivml.edmvalidation.EdmSchemaValidator.validateAgainstEdm(gr.ntua.ivml.edmvalidation.util.StringUtils.resolveNameToInputStream(fname), true, true);
}