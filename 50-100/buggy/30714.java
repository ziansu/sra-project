@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor, long id) {
    if (view instanceof timersassignment.simplegallery.image.ImageGridItemView) {
        java.lang.Boolean isChecked = mCheckedStateMap.containsKey(id);
        ((timersassignment.simplegallery.image.ImageGridItemView) (view)).setCheckBox(mCheckMode);
        ((timersassignment.simplegallery.image.ImageGridItemView) (view)).setChecked(isChecked(id));
    }
}