@java.lang.Override
public void onSuccess(com.eeyuva.screens.DetailPage.ArticleDetailResponse responseBody) {
    mView.setOtherArticleDetails(responseBody.getResponse());
}