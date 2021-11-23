@org.testng.annotations.BeforeMethod(groups = { "isolated" , "short" , "long" })
public void setUp(java.lang.reflect.Method testMethod) throws java.lang.Exception {
    if ((testMode) == (TestMode.PER_METHOD))
        initTestContext(testMethod.getDeclaringClass(), testMethod);
    
}