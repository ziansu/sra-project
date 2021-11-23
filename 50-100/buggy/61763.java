private com.pancheng.barrageview.bean.BarrageItemBeanWithImg getBarrageItemBean(java.lang.String content, java.lang.String headrUrl, android.widget.RelativeLayout barrageItemRelativeLayout, int startY, int startX) {
    com.pancheng.barrageview.bean.BarrageItemBeanWithImg barrageItemBean = new com.pancheng.barrageview.bean.BarrageItemBeanWithImg();
    barrageItemBean.mHeadUrl = headrUrl;
    barrageItemBean.mContent = content;
    barrageItemBean.curAlpha = 0;
    barrageItemBean.mIsFadeIn = true;
    barrageItemBean.contentView = barrageItemRelativeLayout;
    barrageItemBean.mPosX = startX;
    barrageItemBean.mPosY = startY;
    barrageItemRelativeLayout.setAlpha(1);
    addView(barrageItemRelativeLayout);
    return barrageItemBean;
}