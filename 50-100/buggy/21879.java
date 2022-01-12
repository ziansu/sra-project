@android.support.annotation.CallSuper
protected void onPreBindViewHolder(android.database.Cursor cursor, de.aw.awlib.recyclerview.AWLibViewHolder holder) {
    int indexID = cursor.getColumnIndex(getString(R.string._id));
    if (indexID != (-1)) {
        long id = cursor.getLong(indexID);
        holder.setID(id);
    }
}