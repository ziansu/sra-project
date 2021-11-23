@java.lang.Override
public void onPageSelected(int position) {
    this.app.invalidateOptionsMenu();
    mercandalli.com.filespace.ui.fragment.FileManagerFragment.listFragment[position].updateFab();
}