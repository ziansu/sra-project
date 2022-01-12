@java.lang.Override
public void onPageSelected(int position) {
    if ((position == 1) && (selfProfile)) {
        togglePostButtons(true);
    }else {
        togglePostButtons(false);
    }
}