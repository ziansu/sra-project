public void updateDownloads(java.util.List<com.chaemil.hgms.model.Download> beardDownloads) {
    this.downloads.clear();
    this.downloads.addAll(beardDownloads);
    notifyDataSetChanged();
}