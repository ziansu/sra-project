public java.lang.Boolean booleanParameter(java.lang.String parameter_name, java.lang.Boolean default_value) {
    try {
        if (getParameter(parameter_name).equalsIgnoreCase("true"))
            return true;
        
        if (getParameter(parameter_name).equalsIgnoreCase("false"))
            return false;
        
    } catch (edu.cuny.qc.speech.AuToBI.core.AuToBIException e) {
        return default_value;
    }
    return default_value;
}