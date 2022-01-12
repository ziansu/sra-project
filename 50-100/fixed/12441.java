@java.lang.Override
public void onClick(android.view.View v) {
    if (!(android.text.TextUtils.isEmpty(prevKey))) {
        android.content.Intent intent = new android.content.Intent(getActivity(), kyi.senti.activity.CommentActivity.class);
        intent.putExtra("cardKey", prevKey);
        intent.putExtra("userId", userId);
        intent.putExtra("flag", true);
        startActivity(intent);
    }
}