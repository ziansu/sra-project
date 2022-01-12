@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mImagePath = (android.os.Environment.getExternalStorageDirectory().getPath()) + "/DownLoad/";
    mListImage = new com.guo.samples.ImageListNetActivity.ListImage(this, name);
    setListAdapter(mListImage);
    getListView().setOnItemClickListener(this);
    mCacheThread = new com.guo.android_extend.cache.BitmapMonitorThread<com.guo.android_extend.widget.ExtImageView, java.lang.String>(new android.os.Handler());
    mCacheThread.start();
    mHandler = new android.os.Handler();
    mDownloaderManager = new com.guo.android_extend.network.DownloaderManager();
}