@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.example.tomas.becomebasketballpro.ArticleDetailsActivity.class);
    java.lang.String postKey = articleModel.get(position).getId();
    intent.putExtra(ArticleDetailsActivity.EXTRA_POST_KEY, postKey);
    getActivity().startActivity(intent);
}