@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if (savedInstanceState != null) {
        editText.setText(savedInstanceState.getString(ly.loud.loudly.ui.PostCreateFragment.EDIT_TEXT));
    }
}