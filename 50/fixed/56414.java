private static void getNews(@caplan.innovations.trendy.network.NewsNetwork.NewsType
int newsType) {
    android.content.Intent intent = new android.content.Intent(caplan.innovations.trendy.application.TrendyApplication.context(), caplan.innovations.trendy.services.NewsIntentService.class);
    intent.putExtra(caplan.innovations.trendy.services.NewsIntentService.KEY_NEWS_TYPE, newsType);
    caplan.innovations.trendy.application.TrendyApplication.getInstance().startService(intent);
}