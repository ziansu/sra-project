public java.util.Date getItemValueDate(java.lang.String aName) {
    try {
        java.util.List<?> v = getItemValue(aName);
        if ((v.size()) == 0)
            return null;
        
        java.lang.Object o = v.get(0);
        if (!(o instanceof java.util.Date))
            return null;
        
        return ((java.util.Date) (o));
    } catch (java.lang.ClassCastException e) {
        return null;
    }
}