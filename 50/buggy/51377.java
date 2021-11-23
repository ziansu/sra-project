public void remove(org.csstudio.utility.toolbox.entities.Document document) {
    org.csstudio.utility.toolbox.entities.Document doc = em.find(org.csstudio.utility.toolbox.entities.Document.class, document.getId());
    fileStoreService.removeFileStoreEntry(doc);
    em.remove(doc);
}