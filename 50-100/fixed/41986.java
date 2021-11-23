private java.lang.String expandClassName(java.lang.String className) {
    java.lang.String packageName = getPackageName();
    if (className.startsWith("."))
        return packageName + className;
    else
        if (!(className.contains(".")))
            return (packageName + ".") + className;
        else
            return className;
        
    
}