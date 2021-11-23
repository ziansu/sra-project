private static void gotoExceptionHandler(java.lang.StringBuffer output, int pc, icecaptools.compiler.aot.LabelsManager labelsManager, icecaptools.compiler.aot.StackManager sm, boolean b, java.lang.String lthrowexception, java.lang.String object) throws java.lang.Exception {
    output.append((("      pc = " + pc) + ";\n"));
    labelsManager.jumpTo(sm, b);
    if (object != null) {
        output.append(object);
    }
    output.append((("      goto " + lthrowexception) + ";\n"));
}