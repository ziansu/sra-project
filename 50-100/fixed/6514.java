@org.junit.Test
public void testCompositeFunction() {
    final org.bootapp.utilities.jmockit.test.BasedFunctionClass basedFunctionClass = new org.bootapp.utilities.jmockit.test.BasedFunctionClass();
    new mockit.Expectations(basedFunctionClass) {
        {
            basedFunctionClass.basedFunction("info");
            result = "hi info";
        }
    };
    org.bootapp.utilities.jmockit.test.CompositeFunctionClass compositeFunctionClass = new org.bootapp.utilities.jmockit.test.CompositeFunctionClass(basedFunctionClass);
    java.lang.System.out.println(compositeFunctionClass.compositeFunction("info"));
}