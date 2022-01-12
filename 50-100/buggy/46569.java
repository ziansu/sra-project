public java.lang.Boolean booleanParameter(java.lang.String parameter_name, java.lang.Boolean default_value) {
    if (hasParameter(parameter_name)) {
        try {
            if (getParameter(parameter_name).equalsIgnoreCase("true"))
                return true;
            
            if (getParameter(parameter_name).equalsIgnoreCase("false"))
                return false;
            
        } catch (edu.cuny.qc.speech.AuToBI.core.AuToBIException e) {
            edu.cuny.qc.speech.AuToBI.util.AuToBIUtils.warn((("Parameter, " + parameter_name) + ", interpreted as boolean with value neither true nor false"));
        }
        return true;
    }else {
        return default_value;
    }
}