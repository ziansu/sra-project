public void testGetOrganizedImportSectionWithInnerClasses_02() throws java.lang.Exception {
    java.lang.String model = "import org.eclipse.emf.ecore.resource.Resource\n" + ((((((((("import org.eclipse.emf.ecore.EPackage\n" + "") + "\n") + "class Foo {\n") + "  def test() {\n") + "    val x = Resource$Factory$Registry::INSTANCE\n") + "    val y = EPackage$Registry::INSTANCE\n") + "    !x.equals(y)\n") + "  }\n") + "}\n");
    org.eclipse.xtext.xtend2.xtend2.XtendFile file = file(model, true);
    java.lang.String section = organizeImports.getOrganizedImportSection(((org.eclipse.xtext.resource.XtextResource) (file.eResource())));
    assertEquals(("\n" + ("\nimport org.eclipse.emf.ecore.EPackage$Registry" + "\nimport org.eclipse.emf.ecore.resource.Resource$Factory$Registry")), section);
}