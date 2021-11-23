@java.lang.Override
public void onLoadMore(int current_page) {
    java.lang.String url = WebParser.QueryBuilder.buildQuery(WebParser.DataSource.getUrl("entry.getComments"), new java.lang.Object[]{ hash , loadedComments });
    new popups.CommentsPopup.LoadComments(url).execute();
}