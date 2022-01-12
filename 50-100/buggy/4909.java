@org.junit.Test
public void commentsOnStatements() throws java.io.IOException, org.jlato.parser.ParseException {
    final java.lang.String original = resourceAsString("org/jlato/samples/TestClass_nonformated.java");
    org.jlato.tree.decl.CompilationUnit cu = parse(original, true);
    org.junit.Assert.assertNotEquals(org.jlato.printer.Printer.printToString(cu, FormattingSettings.Default), org.jlato.printer.Printer.printToString(cu, false, FormattingSettings.Default));
    org.junit.Assert.assertEquals(org.jlato.printer.Printer.printToString(cu, FormattingSettings.Default), org.jlato.printer.Printer.printToString(cu, true, FormattingSettings.Default));
}