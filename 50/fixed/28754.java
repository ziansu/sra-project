@java.lang.Override
public void onPageSelected(int page) {
    if ((page == (tagFormFragmentPosition)) && ((tagFormFragment) != null)) {
        tagFormFragment.update();
    }
}