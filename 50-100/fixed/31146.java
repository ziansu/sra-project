@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<internetofeveryone.ioe.Downloads.DownloadsPresenter> loader, internetofeveryone.ioe.Downloads.DownloadsPresenter presenter) {
    this.presenter = presenter;
    listView = ((android.widget.ListView) (findViewById(R.id.downloads_list)));
    adapter = new internetofeveryone.ioe.Downloads.DownloadsAdapter(presenter.getDownloadedWebsiteNames(), this);
    listView.setAdapter(adapter);
}