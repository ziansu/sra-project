@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.activity_main, container, false);
    getSherlockActivity().getSupportActionBar().setTitle(R.string.loading_news_screen_title);
    com.pischik.nikita.rssreader.RssDownload.Download(true, getSherlockActivity().getApplicationContext(), getSherlockActivity());
    return view;
}