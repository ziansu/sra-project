public void changeToPreviousSection() {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction upTransaction = fragmentManager.beginTransaction();
    upTransaction.setCustomAnimations(R.anim.slide_in_top, R.anim.slide_out_bottom, R.anim.slide_in_left, R.anim.slide_out_right);
    try {
        changeToNewSection(contentManager.getPreviousSubItem(), upTransaction);
    } catch (java.util.NoSuchElementException e) {
    }
}