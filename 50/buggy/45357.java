@java.lang.Override
public void onDownloadComplete(java.io.File result) {
    downloadMagazine.setVisibility(View.GONE);
    selectedMagazine.setVisibility(View.GONE);
    loadMagazine();
    loadThumbnails();
}