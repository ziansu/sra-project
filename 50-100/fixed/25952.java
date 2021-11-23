private void setGridLayout(int orientation) {
    if (orientation == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mLayoutManager.setSpanCount(1);
    }else
        if (orientation == (android.content.res.Configuration.ORIENTATION_PORTRAIT)) {
            mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            mLayoutManager.setSpanCount(3);
        }
    
}