@java.lang.Override
protected void onPostExecute(java.lang.Void params) {
    super.onPostExecute(params);
    if (noError) {
        android.graphics.drawable.Drawable newD = new android.graphics.drawable.BitmapDrawable(getResources(), mNetworkUserInfo.getLastPicture());
        drawablePic[pos] = newD;
        if ((mAdapter.mImageViews[pos]) != null) {
            mAdapter.mImageViews[pos].setImageDrawable(newD);
            mAdapter.updateResource(newD, pos);
            mAdapter.notifyDataSetChanged();
        }
    }
}