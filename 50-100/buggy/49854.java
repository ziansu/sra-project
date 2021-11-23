public void clear() {
    for (int i = 0; i < (cursors.size()); i++) {
        com.java.team17.data.NewsCursor cursor = cursors.get(i);
        if (cursor != null) {
            cursor.close();
        }
    }
    cursors = new java.util.ArrayList<com.java.team17.data.NewsCursor>();
    IDToPosition = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    notifyDataSetChanged();
}