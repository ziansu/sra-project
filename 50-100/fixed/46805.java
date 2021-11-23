private void openTorrentUrl(com.frostwire.android.gui.activities.Intent intent) {
    com.frostwire.android.gui.activities.Intent i = new com.frostwire.android.gui.activities.Intent(this, com.frostwire.android.gui.activities.MainActivity.class);
    i.setAction(Constants.ACTION_SHOW_TRANSFERS);
    i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    startActivity(i);
    final java.lang.String uri = intent.getDataString();
    intent.setAction(null);
    if (uri != null) {
        com.frostwire.android.gui.transfers.TransferManager.instance().downloadTorrent(uri, new com.frostwire.android.gui.activities.HandpickedTorrentDownloadDialogOnFetch(this));
    }else {
        com.frostwire.android.gui.activities.MainActivity.LOG.warn("MainActivity.onNewIntent(): Couldn't start torrent download from Intent's URI, intent.getDataString() -> null");
        com.frostwire.android.gui.activities.MainActivity.LOG.warn("(maybe URI is coming in another property of the intent object - #fragmentation)");
    }
}