@java.lang.Override
public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor, long id) {
    if (view instanceof timersassignment.simplegallery.image.ImageGridItemView) {
        if (mCheckMode) {
            ((timersassignment.simplegallery.image.ImageGridItemView) (view)).setChecked(isChecked(id));
        }else {
            ((timersassignment.simplegallery.image.ImageGridItemView) (view)).setCheckBox(false);
        }
    }
}