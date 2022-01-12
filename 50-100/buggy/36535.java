public void remove(int id) {
    boolean removed = false;
    for (android.util.Pair<java.lang.Integer, java.lang.String> entry : kvPair) {
        if ((entry.first) == id) {
            mIdList.remove(kvPair.indexOf(entry));
            kvPair.remove(entry);
            removed = true;
        }
    }
    if (removed) {
        this.notifyDataSetChanged();
    }
}