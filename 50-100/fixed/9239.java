@java.lang.Override
public java.util.List<java.lang.String> asRequestParameter() {
    if (!(de.interseroh.report.model.MultiSelectParameter.isUnset())) {
        java.util.List<java.lang.String> params = new java.util.ArrayList<>(4);
        for (T value : getValue()) {
            params.add(((("params[" + (de.interseroh.report.model.MultiSelectParameter.getName())) + "].value=") + (de.interseroh.report.model.MultiSelectParameter.urlEncode(asString(value)))));
        }
        return params;
    }else {
        return super.asRequestParameter();
    }
}