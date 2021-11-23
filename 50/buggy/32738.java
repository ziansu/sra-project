public static java.lang.String FormatClassValue(java.lang.String value) {
    if ((shinylearner.helper.DataTypeUtilities.IsInteger(value)) || (shinylearner.helper.DataTypeUtilities.IsNumeric(value)))
        value = (shinylearner.core.AnalysisFileCreator.CLASS_TEMP_PREFIX) + value;
    
    return value;
}