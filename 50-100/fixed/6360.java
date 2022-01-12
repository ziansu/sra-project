private static void backup(java.io.File folder, java.io.File catalogFile) {
    java.io.File backup;
    int i = 0;
    while (true) {
        if (!((backup = new java.io.File(folder, (((org.protege.editor.owl.model.library.OntologyCatalogManager.CATALOG_BACKUP_PREFIX) + (i++)) + ".xml"))).exists())) {
            break;
        }
    } 
    catalogFile.renameTo(backup);
}