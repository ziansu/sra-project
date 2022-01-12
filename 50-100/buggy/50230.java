@java.lang.Override
protected void onPreExecute() {
    mProgressBar = ((android.widget.ProgressBar) (mRootView.findViewById(R.id.progressBar)));
    android.widget.GridView mGridView = ((android.widget.GridView) (mRootView.findViewById(R.id.gridView)));
    mGridData = new java.util.ArrayList<>();
    mGridAdapter = new us.asimgasimzade.android.neatwallpapers.Adapters.ImagesGridViewAdapter(mContext, R.layout.image_grid_item_layout, mGridData);
    mGridView.setAdapter(mGridAdapter);
}