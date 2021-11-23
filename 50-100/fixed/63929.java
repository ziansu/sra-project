public void put(javax.servlet.http.HttpSession session, T value, java.util.Map<java.lang.String, java.lang.Object> expandContext) {
    org.apache.ofbiz.base.util.collections.FlexibleServletAccessor.AttributeAccessor<T> aa = new org.apache.ofbiz.base.util.collections.FlexibleServletAccessor.AttributeAccessor(name, expandContext, this.attributeName, this.fma, this.needsExpand);
    aa.put(session, value);
}