public boolean isItemValueFloat(java.lang.String aName) {
    aName = aName.toLowerCase();
    java.util.List<?> v = getItemValue(aName);
    if ((v.size()) == 0)
        return false;
    else {
        java.lang.Object o = v.get(0);
        return o instanceof java.lang.Float;
    }
}