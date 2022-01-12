public rx.Observable<com.codepath.nytimes.model.SearchResult> getFilteredArticle(java.lang.String query, java.lang.String date, java.lang.String sort, java.lang.String newDeskString, int page) {
    return nyTimesService.getFilteredArticle(query, date, sort, newDeskString, page, com.codepath.nytimes.repository.NYTimesRepository.API_KEY);
}