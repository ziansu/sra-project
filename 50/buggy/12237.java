@org.testng.annotations.Test(expectedExceptions = java.lang.invoke.WrongMethodTypeException.class)
public void test_fun_wrong_arity() throws java.lang.Throwable {
    gololang.FunctionReference overloaded = gololang.Predefined.fun("overloaded", gololang.PredefinedTest.MyCallable.class, 1);
    overloaded.handle().invoke(1, 2);
}