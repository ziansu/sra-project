@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    com.lixudong.android.nytarticlesearch.models.Article article = articles.get(position);
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.lixudong.android.nytarticlesearch.activities.ArticleActivity.class);
    i.putExtra("article", org.parceler.Parcels.wrap(article));
    startActivity(i);
}