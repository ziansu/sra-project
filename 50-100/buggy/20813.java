public void getAutouniqueAttributeMethods() {
    cruise.umple.compiler.Attribute a = new cruise.umple.compiler.Attribute("a", null, "autounique", null, false, umpleClass);
    java.util.ArrayList<java.lang.String> methods = a.getMethodNames();
    cruise.umple.compiler.Assert.assertTrue(methods.contains("setA"));
    cruise.umple.compiler.Assert.assertTrue(methods.contains("getA"));
    cruise.umple.compiler.Assert.assertEquals(methods.size(), 2);
}