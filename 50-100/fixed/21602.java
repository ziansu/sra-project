@org.testng.annotations.Test
public void test_fun_overloaded2() throws java.lang.Throwable {
    gololang.FunctionReference overloaded = gololang.Predefined.fun(null, "overloaded", gololang.PredefinedTest.MyCallable.class, 2);
    org.hamcrest.MatcherAssert.assertThat(((java.lang.Integer) (overloaded.handle().invoke(1, 2))), is(3));
}