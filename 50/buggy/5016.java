@java.lang.Override
public void onPageSelected(int position) {
    int dialogResource = (position == 0) ? R.string.info_note_list_r : R.string.info_image_grid_r;
    com.example.diegoinsua.uibestpracticesexample.fragment.InfoDialogFragment infoDialogFragment = com.example.diegoinsua.uibestpracticesexample.fragment.InfoDialogFragment.newInstance(dialogResource);
    infoDialogFragment.show(getFragmentManager(), "Info dialog");
}