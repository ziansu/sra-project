public void dataChanged() {
    listView = ((android.widget.ListView) (findViewById(R.id.downloads_list)));
    adapter = new internetofeveryone.ioe.Downloads.DownloadsAdapter(presenter.getDownloadedWebsiteNames(), this);
    listView.setAdapter(adapter);
}