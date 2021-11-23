private java.util.List<org.model.article.Article> getAll(boolean thin) {
    return repository.get(new org.repo.specification.EachArticle(), (thin ? org.hibernate.FetchMode.SELECT : org.hibernate.FetchMode.JOIN));
}