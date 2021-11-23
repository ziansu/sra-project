public void update(net.osmand.plus.download.DownloadResourceGroup mainGroup) {
    data = mainGroup.getGroups();
    notifyDataSetChanged();
}