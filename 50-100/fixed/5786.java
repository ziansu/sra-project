public void testArrayAsVararg() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
    loadText("private fun asList(vararg elems: String) = elems; fun test(ts: Array<String>) = asList(*ts); ");
    java.lang.reflect.Method main = generateFunction("test");
    java.lang.String[] args = new java.lang.String[]{ "mama" , "papa" };
    java.lang.String[] result = ((java.lang.String[]) (main.invoke(null, new java.lang.Object[]{ args })));
    assertTrue((args == result));
}