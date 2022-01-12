public com.smartstudy.zhike.mylibrary.widget.BannerView setPages(com.smartstudy.zhike.mylibrary.widget.ViewHolderCreator holderCreator, java.util.List<T> datas) {
    this.mDatas = datas;
    this.holderCreator = holderCreator;
    pageAdapter = new com.smartstudy.zhike.mylibrary.widget.BasePageAdapter(holderCreator, mDatas);
    viewPager.setAdapter(pageAdapter);
    viewPager.setBoundaryCaching(true);
    if ((page_indicatorId) != null)
        setPageIndicator(page_indicatorId);
    
    return this;
}