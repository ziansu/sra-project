public void printWarnings() {
    java.lang.String file = "";
    for (final org.thingml.compilers.checker.Checker.CheckerInfo i : Warnings) {
        if (!(i.file.equals(file))) {
            java.lang.System.out.println(("Warnings in file " + (i.file)));
            file = i.file;
        }
        java.lang.System.out.print(("\t" + (i.toString())));
    }
}