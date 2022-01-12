public int getBacklogMarkerPosition() {
    try {
        for (int i = 0; ((data) != null) && (i < (data.size())); i++) {
            com.irccloud.android.data.model.Event e = data.get(i);
            if ((e != null) && ((e.row_type) == (com.irccloud.android.fragment.MessageViewFragment.ROW_BACKLOGMARKER))) {
                return i;
            }
        }
    } catch (java.lang.Exception e) {
    }
    return -1;
}