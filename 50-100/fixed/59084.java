private void prepareQuery() {
    query.delete(0, query.length());
    for (int i = 0; i < (qParams.size()); i++) {
        java.lang.String amp = (i != ((qParams.size()) - 1)) ? "&" : "";
        query.append(((qParams.get(i)) + amp));
    }
}