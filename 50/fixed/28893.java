@java.lang.Override
public void onDelete(android.view.View view) {
    int position = mSlideItemPosition;
    if ((mSlideItemPosition) != (-1)) {
        onItemDelete(view, position);
        mSlideItemPosition = -1;
    }
}