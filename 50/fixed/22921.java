public <T extends com.cua.admin.model.finance.documents.Document> T save(T document) {
    return this.documentRepository.saveAndFlush(document);
}