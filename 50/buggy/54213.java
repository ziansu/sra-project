@java.lang.Override
protected void onResume() {
    super.onResume();
    chaitanya.im.searchforreddit.ShareActivity.ruler.setVisibility(View.INVISIBLE);
    android.util.Log.d("ShareActivity.java", "onResume");
}