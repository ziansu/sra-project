public java.util.List<spark.model.bean.Suggestion> suggest(javax.servlet.http.HttpServletRequest request) throws spark.exception.SuggestionException {
    java.util.List<spark.model.bean.Suggestion> suggestions = new java.util.LinkedList<spark.model.bean.Suggestion>();
    java.lang.String query = request.getParameter("query");
    if (((query != null) && (!(query.equals("")))) && ((query.length()) >= (spark.Constant.SUGGESTION_QUERY_MINSIZE))) {
        spark.model.dao.SuggestionDAO suggestionDAO = new spark.model.dao.SuggestionDAO();
        suggestions = suggestionDAO.getByQueryOrderByScoring(query);
    }
    return suggestions;
}