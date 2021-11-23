@java.lang.Override
public boolean setViewValue(android.view.View view, android.database.Cursor cursor, int columnIndex) {
    if ((view.getId()) == (R.id.image_doodle_thumbnail)) {
        com.squareup.picasso.Picasso.with(getActivity()).load(("http:" + (cursor.getString(cursor.getColumnIndex(DoodleColumns.URL))))).into(((android.widget.ImageView) (view)));
        return true;
    }
    return false;
}