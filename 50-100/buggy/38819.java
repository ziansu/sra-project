public java.lang.Class findClass(java.lang.String name) throws java.lang.ClassNotFoundException {
    java.lang.Class cls = cachedClass(name);
    if (cls != null)
        return cls;
    
    byte[] classData = loadClassData(name);
    if (classData == null)
        return super.findClass(name);
    
    cls = defineClass(null, classData, 0, classData.length);
    saveClass(classData, name);
    cacheClass(cls, name);
    return cls;
}