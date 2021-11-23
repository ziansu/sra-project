public void _testBug508889_003() throws java.lang.Exception {
    java.lang.String[] contents = new java.lang.String[]{ "module-info.java" , "module first {\n" + (("exports pack1;\n" + "exports pack2 to zero;\n") + "}\n") , "pack1/X11.java" , "package pack1;\n" + "public class X11 {}\n" , "pack2/X21.java" , "package pack2;\n" + "public class X21 {}\n" };
    org.eclipse.jdt.core.util.IModuleAttribute module = getModuleAttribute(contents);
    assertEquals("Wrong Module Name", "first", new java.lang.String(module.getModuleName()));
    assertTrue("Unexpected attribute length", ((module.getAttributeLength()) > 0));
}