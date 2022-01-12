public void printErrors() {
    java.lang.String file = "";
    for (final org.thingml.compilers.checker.Checker.CheckerInfo i : Errors) {
        if (((i.file) != null) && (!(i.file.equals(file)))) {
            java.lang.System.err.println(("Errors in file " + (i.file)));
            file = i.file;
        }
        java.lang.System.err.print(("\t" + (i.toString())));
    }
}