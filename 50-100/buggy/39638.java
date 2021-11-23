private static com.mishiranu.dashchan.widget.ListScroller getListScroller(android.widget.ListView listView, boolean mayCreate) {
    com.mishiranu.dashchan.widget.ListScroller listScroller = ((com.mishiranu.dashchan.widget.ListScroller) (listView.getTag(R.id.seek_bar)));
    if ((listScroller == null) && mayCreate) {
        listScroller = new com.mishiranu.dashchan.widget.ListScroller(listView);
        listView.setTag(R.id.seek_bar);
    }
    return listScroller;
}