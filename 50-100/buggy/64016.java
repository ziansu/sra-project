public java.lang.String getGoogleSearchTerm() {
    java.lang.StringBuilder searchTerm = new java.lang.StringBuilder();
    for (com.papao.books.model.Autor autor : autori) {
        if ((searchTerm.length()) > 0) {
            searchTerm.append("+");
        }
        searchTerm.append(com.lowagie.text.html.HtmlEncoder.encode(autor.getNumeComplet()));
    }
    return searchTerm.toString();
}