private void gotoExceptionHandler(java.lang.StringBuffer output, int pc, java.lang.String string, icecaptools.compiler.aot.LabelsManager labelsManager, icecaptools.compiler.aot.StackManager sm, boolean b, java.lang.String lthrowexception, java.lang.Object object) throws java.lang.Exception {
    output.append((("      pc = " + pc) + ";\n"));
    labelsManager.jumpTo(sm, b);
    output.append((("      goto " + lthrowexception) + ";\n"));
}