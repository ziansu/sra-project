@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String url = ((java.lang.String) (v.getTag(R.id.key_link)));
    if ((url != null) && ((url.length()) != 0)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.subang.app.activity.WebActivity.class);
        intent.putExtra("url", ((com.subang.util.WebConst.HOST_URI) + url));
        startActivity(intent);
    }
}