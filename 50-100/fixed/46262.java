@java.lang.Override
public void onBindViewHolder(edu.cs430x.fuschia.geosnap.adapters.DiscoveredAdapter.DiscoveredViewHolder discoveredViewHolder, int i) {
    if (!(mDataValid)) {
        throw new java.lang.IllegalStateException("this should only be called when the cursor is valid");
    }
    if (!(mCursor.moveToPosition(i))) {
        throw new java.lang.IllegalStateException(("couldn't move cursor to position " + i));
    }
    java.lang.String id = java.lang.Integer.toString(mCursor.getInt(mRowIdColumn));
    discoveredViewHolder.textView.setText(id);
}