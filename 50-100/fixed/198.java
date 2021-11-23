public void setCategoryClickable(boolean clickable) {
    testproject.halfmoonstudios.com.ponder.FragmentActionBar actionFragment = ((testproject.halfmoonstudios.com.ponder.FragmentActionBar) (fm.findFragmentById(R.id.optionsContainer)));
    if (actionFragment != null) {
        android.util.Log.v("HERE", (clickable + ""));
        actionFragment.setCategoryClickable(clickable);
    }
}