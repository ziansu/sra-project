public java.lang.String getString(java.lang.String name) {
    return ((java.lang.String) (get(name, edu.cmu.tetrad.util.ParamDescriptions.instance().get(name).getDefaultValue())));
}