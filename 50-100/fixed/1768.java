public static java.lang.String getSimpleTestName() {
    java.lang.String out = org.kurento.test.services.KurentoServicesTestHelper.testName;
    if (((org.kurento.test.services.KurentoServicesTestHelper.testName) != null) && ((out.indexOf(":")) != (-1))) {
        out = (out.substring(0, out.indexOf(":"))) + "]";
    }
    return out;
}