@java.lang.Override
public boolean apply(java.lang.Object input) {
    org.apache.commons.jxpath.JXPathContext jxpath = org.apache.commons.jxpath.JXPathContext.newContext(input);
    jxpath.setLenient(true);
    org.apache.commons.jxpath.Pointer pointer = jxpath.getPointer(xpath);
    return (pointer != null) && (!(pointer instanceof org.apache.commons.jxpath.ri.model.beans.NullPointer));
}