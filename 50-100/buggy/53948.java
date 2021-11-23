public static void main(java.lang.String[] args) {
    org.junit.runner.Result result = org.junit.runner.JUnitCore.runClasses(test.uk.ac.kent.dover.FastGraphTest.class);
    for (org.junit.runner.notification.Failure failure : result.getFailures()) {
        java.lang.System.out.println(failure.toString());
    }
    java.lang.System.out.println(result.wasSuccessful());
    result = org.junit.runner.JUnitCore.runClasses(test.uk.ac.kent.dover.ExactIsomorphismTest.class);
    for (org.junit.runner.notification.Failure failure : result.getFailures()) {
        java.lang.System.out.println(failure.toString());
    }
    java.lang.System.out.println(result.wasSuccessful());
}