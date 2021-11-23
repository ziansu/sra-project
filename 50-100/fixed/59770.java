public org.fnppl.opensdx.dmi.wayout.Result formatToExternalFile() {
    try {
        org.fnppl.opensdx.dmi.wayout.Document doc = this.getExportDocument();
        if ((doc != null) && ((saveFile) != null)) {
            doc.writeToFile(this.saveFile);
        }
    } catch (java.lang.Exception e) {
        ir.succeeded = false;
        ir.errorMessage = e.getMessage();
        ir.exception = e;
    }
    return ir;
}