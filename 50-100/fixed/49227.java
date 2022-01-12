public java.util.List<xyz.codingmentor.model.Movie> findMovieTitleOrCategory(java.lang.String title, java.lang.Long categoryId) {
    if (null != title) {
        if (null != categoryId) {
            return findMovieTitleCategory(title, categoryId);
        }
        return findMoviesForTitle(title);
    }
    if (null != categoryId) {
        return findMoviesForCategory(categoryId);
    }
    throw new java.lang.IllegalArgumentException("Need at least one query param!");
}