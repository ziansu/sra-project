private java.lang.String getJNIFunctionName() {
    org.iguanatool.testobject.JavaWrapper javaWrapper = new org.iguanatool.testobject.JavaWrapper(caseStudy, testObjectName);
    java.lang.String packageName = javaWrapper.getTestObjectsPackageName().replace("_", "_1");
    packageName = packageName.replace(".", "_");
    java.lang.String className = testObjectName.replace("_", "_1");
    return ((("Java_" + packageName) + "_") + className) + "_call";
}