private java.util.Properties getPropertiesFor(org.testng.ITestNGMethod method, long elapsedTimeMillis) {
    java.util.Properties attrs = new java.util.Properties();
    java.lang.String name = org.testng.internal.Utils.detailedMethodName(method, false);
    attrs.setProperty(XMLConstants.ATTR_NAME, name);
    attrs.setProperty(XMLConstants.ATTR_CLASSNAME, method.getRealClass().getName());
    attrs.setProperty(XMLConstants.ATTR_TIME, ("" + (((double) (elapsedTimeMillis)) / 1000)));
    return attrs;
}