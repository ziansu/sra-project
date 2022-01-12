public static void summarizeWrittenInputs(edu.columbia.cs.psl.ioclones.pojo.IORecord record, int depth) {
    java.lang.System.out.println(((("Summarizing written inputs: " + (record.getMethodKey())) + " ") + (record.getId())));
    for (java.lang.Object o : record.preload.values()) {
        if (edu.columbia.cs.psl.ioclones.analysis.dynamic.HitoTaintChecker.shouldCheck(o, record.getId())) {
            edu.columbia.cs.psl.ioclones.analysis.dynamic.HitoTaintChecker.analyzeTaint(o, depth, record, false);
        }
    }
    java.lang.System.out.println();
}