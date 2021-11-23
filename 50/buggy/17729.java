public static boolean shouldExecuteBeforeSuite() {
    synchronized(com.consol.citrus.junit.TestSuiteState.beforeSuiteState) {
        if (!(com.consol.citrus.junit.TestSuiteState.beforeSuiteState)) {
            com.consol.citrus.junit.TestSuiteState.beforeSuiteState = true;
            return true;
        }else {
            return false;
        }
    }
}