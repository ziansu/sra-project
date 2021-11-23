@java.lang.Override
public void onDelete(android.view.View view) {
    int position = mSlideItemPosition;
    onItemDelete(view, position);
    mSlideItemPosition = -1;
}