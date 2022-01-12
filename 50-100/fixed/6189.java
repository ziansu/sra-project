public void setParallaxHeader(android.view.View header) {
    mHeader = new com.marshalchen.ultimaterecyclerview.UltimateRecyclerView.CustomRelativeWrapper(header.getContext());
    mHeader.setLayoutParams(new android.view.ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    mHeader.addView(header, new android.widget.RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    if ((mAdapter) != null)
        mAdapter.setCustomHeaderView(mHeader);
    
}