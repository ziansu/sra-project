public void printNotices() {
    java.lang.String file = "";
    for (org.thingml.compilers.checker.Checker.CheckerInfo i : Notices) {
        if (((i.file) != null) && (!(i.file.equals(file)))) {
            java.lang.System.out.println(("Notices in file " + (i.file)));
            file = i.file;
        }
        java.lang.System.out.print(("\t" + (i.toString())));
    }
}