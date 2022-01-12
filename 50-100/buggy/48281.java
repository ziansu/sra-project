@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.lixudong.android.nytarticlesearch.activities.ArticleActivity.class);
    com.lixudong.android.nytarticlesearch.models.Article article = articles.get(position);
    i.putExtra("article", org.parceler.Parcels.wrap(article));
    startActivity(i);
}