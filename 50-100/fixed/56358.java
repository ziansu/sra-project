public T get(javax.servlet.http.HttpSession session) {
    java.lang.Object theValue = null;
    if (isListReference) {
        java.util.List<T> lst = org.apache.ofbiz.base.util.UtilGenerics.cast(session.getAttribute(attributeName));
        theValue = lst.get(listIndex);
    }else {
        theValue = session.getAttribute(attributeName);
    }
    if ((fma) != null) {
        return fma.get(org.apache.ofbiz.base.util.UtilGenerics.<java.lang.String, java.lang.Object>checkMap(theValue));
    }
    return org.apache.ofbiz.base.util.UtilGenerics.<T>cast(theValue);
}