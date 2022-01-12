private java.lang.String getJNIFunctionName() {
    org.iguanatool.testobject.JavaWrapper javaWrapper = new org.iguanatool.testobject.JavaWrapper(caseStudy, testObjectName);
    java.lang.String packageName = javaWrapper.getTestObjectsPackageName().replace(".", "_");
    java.lang.String safeClassName = testObjectName.replace("_", "_1");
    return ((("Java_" + packageName) + "_") + safeClassName) + "_call";
}