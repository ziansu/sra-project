@org.junit.Test
public void testForNamespace() {
    com.indeed.util.varexport.VarExporter alt = com.indeed.util.varexport.VarExporter.forNamespace("foo");
    org.junit.Assert.assertFalse(alt.getVariables().iterator().hasNext());
    com.indeed.util.varexport.VarExporter.forNamespace("foo").export(com.indeed.util.varexport.VarExporterTest.ExampleClass.class, "");
    com.indeed.util.varexport.VarExporterTest.assertExportedNames(alt, "static1field", "static1method", "myNameIsEarl");
    com.indeed.util.varexport.VarExporterTest.assertExportedNames(exporter);
}