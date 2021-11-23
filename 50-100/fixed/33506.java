public java.util.List<spark.model.bean.Suggestion> suggest(javax.servlet.http.HttpServletRequest request) throws spark.exception.SuggestionException {
    java.util.List<spark.model.bean.Suggestion> suggestions = new java.util.LinkedList<spark.model.bean.Suggestion>();
    java.lang.String query = request.getParameter("query");
    if ((query != null) && ((query.length()) >= (spark.Constant.SUGGESTION_QUERY_MINSIZE))) {
        query = query.toLowerCase();
        suggestions = suggestionDAO.getByQueryOrderByScoring(query);
    }
    return suggestions;
}