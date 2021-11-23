@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getActivity(), qa.dcsdr.diplomaticclub.Activities.ArticleReader.class);
    intent.putExtra("CAT_TITLE", category);
    intent.putExtra("ARTICLE_LIST", articleList);
    intent.putExtra("POSITION", 0);
    intent.putExtra("IS_HOME", 1);
    intent.putExtra(getString(R.string.PARENT_CLASS_TAG), getString(R.string.DISPLAY_FRAGMENT_TAG));
    startActivity(intent);
}