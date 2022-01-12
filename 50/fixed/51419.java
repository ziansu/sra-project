@java.lang.Override
public void onPause() {
    super.onPause();
    mListView.setAdapter(null);
}