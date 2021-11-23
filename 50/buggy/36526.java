public synchronized void removeRecipe(edu.arizona.cs.stargate.common.dataexport.DataExportInfo info) {
    java.util.Collection<edu.arizona.cs.stargate.common.dataexport.DataExportEntry> entries = info.getAllExportEntry();
    for (edu.arizona.cs.stargate.common.dataexport.DataExportEntry entry : entries) {
        removeRecipe(entry.getResourcePath());
    }
}