public java.lang.String getClassNameForJsp(java.lang.String jsp) {
    if (jsp == null)
        return null;
    
    java.lang.String name = getNameOfJspClass(jsp);
    if (org.eclipse.jetty.util.StringUtil.isBlank(name))
        return null;
    
    java.lang.StringBuffer fullName = new java.lang.StringBuffer();
    appendPath(fullName, getJspPackagePrefix());
    appendPath(fullName, getPackageOfJspClass(jsp));
    appendPath(fullName, name);
    return fullName.toString();
}