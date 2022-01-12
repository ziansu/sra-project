public com.smartstudy.zhike.mylibrary.widget.BannerView setPages(java.util.List<T> datas) {
    this.mDatas = datas;
    pageAdapter = new com.smartstudy.zhike.mylibrary.widget.BasePageAdapter(mDatas);
    viewPager.setAdapter(pageAdapter);
    viewPager.setBoundaryCaching(true);
    if ((page_indicatorId) != null)
        setPageIndicator(page_indicatorId);
    
    return this;
}