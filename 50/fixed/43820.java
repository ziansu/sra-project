public java.util.List<org.model.article.Article> getAll() {
    return repository.get(new org.repo.specification.EachArticle(), org.hibernate.FetchMode.SELECT);
}