public <T extends com.cua.admin.model.finance.documents.Document> void save(T document) {
    this.documentRepository.saveAndFlush(document);
}