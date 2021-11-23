@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    com.hoppingeagle.snapbuyer.Auction auction = ((com.hoppingeagle.snapbuyer.Auction) (dataObject));
    mCategoryBean.like(auction);
}