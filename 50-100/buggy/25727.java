public boolean getItemValueBoolean(java.lang.String aName) {
    try {
        aName = aName.toLowerCase();
        java.util.List<?> v = getItemValue(aName);
        if ((v.size()) == 0)
            return false;
        
        java.lang.Object sValue = v.get(0);
        return java.lang.Boolean.valueOf(sValue.toString());
    } catch (java.lang.ClassCastException e) {
        return false;
    }
}