@java.lang.Override
public void execute(io.realm.Realm bgRealm) {
    for (com.android.pena.david.news4u.model.Article article : pArticles) {
        if ((article.getSelection()) == null) {
            article.setSelection(generalUtils.VIEWED_TAG);
        }else
            if (hasArticle(article.getId(), generalUtils.SHARED_TAG)) {
                article.setSelection(generalUtils.BOTH_TAG);
            }else
                if (hasArticle(article.getId(), generalUtils.BOTH_TAG)) {
                    break;
                }
            
        
        bgRealm.copyToRealmOrUpdate(article);
        timber.log.Timber.d("Articles Insert - OK");
    }
}