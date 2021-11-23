public void speichereArtikel(data_objects.Artikel art, int anz) throws domain.exceptions.ArticleAlreadyInBasketException, domain.exceptions.ArticleStockNotSufficientException {
    if (!(sucheArtikel(art))) {
        if (anz > 0) {
            pruefeBestand(art, anz);
            artikel.put(art, anz);
        }
    }else {
        throw new domain.exceptions.ArticleAlreadyInBasketException(art.getBezeichnung());
    }
}