@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, final int position, long id) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.example.tomas.becomebasketballpro.ArticleDetailsActivity.class);
    java.lang.String postKey = articleModel.get(position).getId();
    intent.putExtra(ArticleDetailsActivity.EXTRA_POST_KEY, postKey);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putLong(FirebaseAnalytics.Param.ITEM_ID, id);
    mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    getActivity().startActivity(intent);
}