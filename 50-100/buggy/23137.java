public java.lang.String verifyDocumentDate(org.neo4art.literature.domain.Document document) {
    java.lang.String result = "";
    try {
        if ((document != null) && ((document.getDate()) != null)) {
            java.util.Date documentDate = documentFormat.parse(document.getDate());
            result = format.format(documentDate);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("ERRORE: " + (e.getMessage())));
    }
    return result;
}