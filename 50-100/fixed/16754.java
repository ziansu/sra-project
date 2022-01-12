public java.lang.String getItemValueString(java.lang.String aName) {
    java.util.List<?> v = ((java.util.List<?>) (getItemValue(aName)));
    if ((v.size()) == 0)
        return "";
    else {
        java.lang.Object o = v.get(0);
        if (o == null)
            return "";
        else
            return o.toString();
        
    }
}