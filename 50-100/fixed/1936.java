@org.testng.annotations.Test
public void test_fun_overloaded1() throws java.lang.Throwable {
    gololang.FunctionReference overloaded = gololang.Predefined.fun(null, "overloaded", gololang.PredefinedTest.MyCallable.class, 1);
    org.hamcrest.MatcherAssert.assertThat(((java.lang.Integer) (overloaded.handle().invoke(2))), is(3));
}