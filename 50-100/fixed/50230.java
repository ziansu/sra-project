@java.lang.Override
protected void onPreExecute() {
    android.widget.GridView mGridView;
    mProgressBar = ((android.widget.ProgressBar) (mRootView.findViewById(R.id.progressBar)));
    mGridView = ((android.widget.GridView) (mRootView.findViewById(R.id.gridView)));
    mGridData = new java.util.ArrayList<>();
    mGridAdapter = new us.asimgasimzade.android.neatwallpapers.Adapters.ImagesGridViewAdapter(mContext, R.layout.image_grid_item_layout, mGridData);
    mGridView.setAdapter(mGridAdapter);
}