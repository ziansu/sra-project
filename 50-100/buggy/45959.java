@java.lang.Override
public <U, T extends li.strolch.model.parameter.Parameter<U>> T findParameter(java.lang.String bagKey, java.lang.String paramKey) {
    T parameter = getParameter(bagKey, paramKey);
    if (parameter != null)
        return parameter;
    
    if ((this.parent) != null)
        return this.parent.findParameter(bagKey, paramKey);
    
    return null;
}