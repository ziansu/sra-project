private boolean importItems(cz.cas.lib.proarc.common.dao.Batch batch, java.lang.String importer, java.util.List<java.lang.String> ingests) {
    boolean itemFailed = false;
    for (cz.cas.lib.proarc.common.imports.ImportBatchManager.BatchItemObject item : ibm.findLoadedObjects(batch)) {
        item = importItem(item, importer);
        if (item != null) {
            if ((cz.cas.lib.proarc.common.dao.BatchItem.ObjectState.INGESTING_FAILED) == (item.getState())) {
                itemFailed = true;
            }else {
                ingests.add(item.getPid());
            }
        }
    }
    return itemFailed;
}