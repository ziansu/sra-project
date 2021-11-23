private void setGridLayout(int orientation) {
    if (orientation == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        mLayoutManager.setSpanCount(1);
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
    }else
        if (orientation == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
            mLayoutManager.setSpanCount(3);
            mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        }
    
}