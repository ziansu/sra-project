public T remove(javax.servlet.ServletRequest request, java.util.Map<java.lang.String, java.lang.Object> expandContext) {
    org.apache.ofbiz.base.util.collections.FlexibleServletAccessor.AttributeAccessor<T> aa = new org.apache.ofbiz.base.util.collections.FlexibleServletAccessor.AttributeAccessor<T>(name, expandContext, this.attributeName, this.fma, this.needsExpand);
    return aa.remove(request);
}