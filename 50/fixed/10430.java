public void updateDownloads(java.util.List<com.chaemil.hgms.model.Download> downloads) {
    this.downloads.clear();
    this.downloads.addAll(downloads);
    notifyDataSetChanged();
}