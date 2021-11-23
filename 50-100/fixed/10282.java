@java.lang.Override
protected void onPostExecuteSuccess(gcum.gcumfisher.connection.Server.GetListResult photos) {
    if (photos != null) {
        final java.util.List<gcum.gcumfisher.connection.ServerPhoto> list = photos.getPhotos();
        showPhotos(list);
        latest = (list.isEmpty()) ? null : list.get(((list.size()) - 1)).getId();
        ((android.widget.Button) (findViewById(R.id.more))).setText(getResources().getString(R.string.more_nb_after, photos.getNbAfter()));
    }
}