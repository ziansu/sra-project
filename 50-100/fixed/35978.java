@java.lang.Override
public void execute(io.realm.Realm bgRealm) {
    for (com.android.pena.david.news4u.model.Article article : pArticles) {
        if ((article.getSelection()) == null) {
            article.setSelection(generalUtils.SHARED_TAG);
        }else
            if (hasArticle(article.getId(), generalUtils.VIEWED_TAG)) {
                article.setSelection(generalUtils.BOTH_TAG);
            }else
                if (hasArticle(article.getId(), generalUtils.BOTH_TAG)) {
                    break;
                }
            
        
        bgRealm.copyToRealmOrUpdate(article);
    }
}