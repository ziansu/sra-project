private java.lang.String paramsToString(org.eclipse.emf.common.util.EList<de.cooperateproject.modeling.textual.cls.cls.Parameter> params) {
    java.lang.String ret = "";
    if ((params.size()) <= 0)
        return ret;
    
    for (de.cooperateproject.modeling.textual.cls.cls.Parameter param : params) {
        ret = ret + (paramLabel.getText(param));
        if ((params.indexOf(param)) < ((params.size()) - 1)) {
            ret += ", ";
        }
    }
    return ret;
}