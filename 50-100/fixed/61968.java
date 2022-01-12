private void processArguments(java.util.List<java.lang.String> arguments) {
    int sum = 0;
    for (java.lang.String str : arguments) {
        try {
            sum += importGirr(new java.io.File(str), false);
        } catch (java.text.ParseException | org.harctoolbox.irscrutinizer.IrpMasterException | java.io.IOException ex) {
            guiUtils.error(ex);
        }
    }
    if (sum > 0)
        selectImportPane(ImportType.parametricRemote);
    
}