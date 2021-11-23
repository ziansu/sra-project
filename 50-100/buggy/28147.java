public java.lang.String getSelectedRatings(java.lang.String rating) {
    java.lang.String star = "";
    for (int i = 5; i >= (java.lang.Integer.parseInt(rating)); i--) {
        if (!(star.isEmpty())) {
            star += org.ednovo.gooru.client.mvp.gsearch.SearchAbstractView.COMMA_SEPARATOR;
        }
        star += i;
    }
    return star.trim();
}