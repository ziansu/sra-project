@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    android.util.Log.v(((TAG) + "SingleUp"), ("Single tap up " + (getItem(itemHolder.position).getItem())));
    if ((itemHolder.editLayout.getVisibility()) == (android.view.View.GONE)) {
        itemHolder.editModeOn();
        mFragment.currentlySelectedItem(itemHolder);
        return true;
    }
    return false;
}