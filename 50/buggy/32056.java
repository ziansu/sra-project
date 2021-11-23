public int getInt(java.lang.String name) {
    return ((java.lang.Number) (get(name, edu.cmu.tetrad.util.ParamDescriptions.instance().get(name).getDefaultValue()))).intValue();
}