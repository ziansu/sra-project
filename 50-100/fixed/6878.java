public void loadAlbums(android.content.Context context, boolean hidden) {
    this.hidden = hidden;
    java.util.ArrayList<org.fossasia.phimpme.leafpic.data.Album> list;
    org.fossasia.phimpme.leafpic.data.providers.StorageProvider p = new org.fossasia.phimpme.leafpic.data.providers.StorageProvider(context);
    list = p.getAlbums(context, hidden);
    dispAlbums = list;
    sortAlbums(context);
}