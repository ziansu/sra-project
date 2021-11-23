@java.lang.Override
public void init() {
    verbose = false;
    inverse = false;
    vcfInputFile = "-";
    filterId = ca.mcgill.mcb.pcingola.snpSift.SnpSift.class.getSimpleName();
    sets = new java.util.ArrayList<java.util.HashSet<java.lang.String>>();
    formatVersion = null;
    exceptionIfNotFound = false;
    gtFieldName = "GT";
    gtFieldValue = ".";
}