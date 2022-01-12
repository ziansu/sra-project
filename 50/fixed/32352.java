@org.testng.annotations.Test(expectedExceptions = java.lang.NoSuchMethodException.class)
public void test_fun_fail() throws java.lang.Throwable {
    gololang.Predefined.fun(null, "helloz", gololang.PredefinedTest.MyCallable.class, 0);
}