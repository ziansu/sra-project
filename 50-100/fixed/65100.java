public long getItemValueLong(java.lang.String aName) {
    try {
        java.util.List<?> v = getItemValue(aName);
        if ((v.size()) == 0)
            return 0;
        
        java.lang.String sValue = v.get(0).toString();
        return new java.lang.Long(sValue).longValue();
    } catch (java.lang.NumberFormatException e) {
        return 0;
    } catch (java.lang.ClassCastException e) {
        return 0;
    }
}