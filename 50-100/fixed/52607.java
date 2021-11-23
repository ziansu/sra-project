public void setall(java.util.List<com.bss.arrahmanlyrics.models.albumModel> models, java.util.HashMap<java.lang.String, java.util.List<com.bss.arrahmanlyrics.models.albumsongs>> map) {
    if ((models != null) && (map != null)) {
        _listDataHeader = new java.util.ArrayList<>();
        _listDataChild = new java.util.HashMap<>();
        _listDataHeader.addAll(models);
        _listDataChild.putAll(map);
        notifyDataSetChanged();
    }
}