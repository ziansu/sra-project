@java.lang.Override
public void onDownloadComplete(java.io.File result) {
    if (result == null) {
    }else {
        downloadMagazine.setVisibility(View.GONE);
        selectedMagazine.setVisibility(View.GONE);
        loadMagazine();
        loadThumbnails();
    }
}