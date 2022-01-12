private java.lang.String expandClassName(java.lang.String className) {
    java.lang.String packageName = getPackageName();
    if (className.startsWith("."))
        return packageName + className;
    else
        if (className.substring(0, 1).equals(className.substring(0, 1).toUpperCase()))
            return (packageName + ".") + className;
        else
            return className;
        
    
}