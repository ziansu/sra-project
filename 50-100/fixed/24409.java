@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.ismth.activity.ArticleActivity.class);
    com.ismth.bean.TodayHotBean thb = ((com.ismth.bean.TodayHotBean) (parent.getItemAtPosition(position)));
    intent.putExtra(Constants.BIDURLKEY, thb.link);
    intent.putExtra(Constants.TITLEBAR, thb.title);
    thb = null;
    startActivity(intent);
}