private void read() {
    mBitmap = com.unimelb.feelinglucky.snapsheet.Util.DatabaseUtils.getImg(DatabaseInstance.database);
    if ((mBitmap) != null) {
        mImg.setImageBitmap(mBitmap);
        mGrid.setVisibility(View.VISIBLE);
    }
}