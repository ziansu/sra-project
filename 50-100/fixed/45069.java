private void initData() {
    mFileName = getIntent().getStringExtra("FileName");
    mFilePath = getIntent().getStringExtra("FilePath");
    mMaxPos = 0;
    mStartPos = 0;
    mDensity = getResources().getDisplayMetrics().density;
    loadFile();
}