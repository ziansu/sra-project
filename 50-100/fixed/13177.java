@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    scrollPosition = layoutManager.findFirstVisibleItemPosition();
    android.content.SharedPreferences sharedPreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putInt(LastPostiionKey, scrollPosition);
    editor.commit();
}