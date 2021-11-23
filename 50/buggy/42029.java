private boolean articleNonPresent(EntityBeans.Article article) {
    return (getPanier().getPanier().get(article)) == null;
}