@java.lang.Override
public void act() {
    timber.log.Timber.d("categorySpinner selected %d", mCategorySpinner.getSelectedItemPosition());
    int position = mCategorySpinner.getSelectedItemPosition();
    if (position != 0) {
        onCategoryChosen(position);
    }
}