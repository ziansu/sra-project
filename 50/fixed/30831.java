public junit.framework.TestSuite getSuite(java.lang.String suiteCase) {
    if (suiteCase.equals("TestRebtelAndroid")) {
        return new junit.framework.TestSuite(com.rebtel.test.TestRebtelAndroid.class);
    }else
        if (suiteCase.equals("TestRebteliOS")) {
        }
    
    return new junit.framework.TestSuite(com.rebtel.test.TestRebtelAndroid.class);
}