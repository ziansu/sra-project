@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode != (android.app.Activity.RESULT_OK)) {
        return ;
    }
    if (requestCode == (com.csci448.freshapps.keepitfresh.ItemListFragment.REQUEST_OPTION)) {
        com.csci448.freshapps.keepitfresh.SortOptions option = ((com.csci448.freshapps.keepitfresh.SortOptions) (data.getSerializableExtra(SortOptionsDialogFragment.EXTRA_SORT_OPTION)));
        updateUI(option);
    }
}