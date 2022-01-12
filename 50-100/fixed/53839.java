public boolean isItemValueDate(java.lang.String aName) {
    java.util.List<?> v = getItemValue(aName);
    if ((v.size()) == 0)
        return false;
    else {
        java.lang.Object o = v.get(0);
        return o instanceof java.util.Date;
    }
}