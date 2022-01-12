protected void onPostExecute(ru.kuchanov.odnako.db.Article article) {
    if (article != null) {
        ru.kuchanov.odnako.db.ServiceArticle.sendDownloadedData(ctx, article, url);
    }else {
        ru.kuchanov.odnako.db.ServiceArticle.sendErrorMsg(ctx, url, Const.Error.CONNECTION_ERROR);
        android.util.Log.e(((ru.kuchanov.odnako.download.ParseArticle.LOG) + (getUrl())), Const.Error.CONNECTION_ERROR);
    }
}