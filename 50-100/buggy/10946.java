public org.test.framework.core.runtime.TestResult execute() {
    org.test.framework.core.runtime.TestResult result = new org.test.framework.core.runtime.TestResult();
    org.test.framework.core.runtime.TestSuite suite = new org.test.framework.core.runtime.TestSuite();
    for (java.lang.Class<?> cl : classList) {
        java.util.List<java.lang.String> names = getMethodNames(org.test.framework.core.runtime.Runtime.ANNOTATION, cl);
        for (java.lang.String methodName : names) {
            suite.add(new org.test.framework.core.runtime.TestCase(methodName));
        }
        suite.run(result, cl);
    }
    return result;
}