@javax.annotation.PostConstruct
public void test() {
    org.tuwien.pdfprocessor.model.Document d = new org.tuwien.pdfprocessor.model.Document();
    d.setDocumentId("chic_1");
    d.setDocumentName("chic");
    java.util.List<org.tuwien.pdfprocessor.model.Document> listOfDocuments = repository.findAll();
    for (org.tuwien.pdfprocessor.model.Document listOfDocument : listOfDocuments) {
        java.lang.System.out.print(listOfDocument.getContent());
    }
}