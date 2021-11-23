public static void startActionFetch(android.content.Context context, int type, java.lang.String response) {
    if (context == null) {
        return ;
    }
    android.content.Intent intent = new android.content.Intent(context, com.dante.knowledge.mvp.presenter.PictureFetchService.class);
    intent.setAction(com.dante.knowledge.mvp.presenter.PictureFetchService.ACTION_FETCH);
    intent.putExtra(Constants.TYPE, type);
    intent.putExtra(Constants.DATA, response);
    context.startService(intent);
}