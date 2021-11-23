@java.lang.Override
protected void repair() throws java.lang.Exception {
    java.util.List<java.io.File> fs = getAllFiles();
    for (java.io.File f1 : fs) {
        try {
            com.globalsight.cxe.adapter.msoffice.WordRepairer.repairDocFiles(f1);
        } catch (java.lang.Exception e) {
        }
    }
}