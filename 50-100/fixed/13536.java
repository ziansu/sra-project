private void initBadge() {
    getBadgeViewHelper().setBadgeBgColorInt(mBadgeBackground);
    getBadgeViewHelper().setBadgeTextSizeSp(mBadgeTextSize);
    getBadgeViewHelper().setBadgePaddingDp(mBadgePadding);
    getBadgeViewHelper().setBadgeVerticalMarginDp(mBadgeVerMargin);
    getBadgeViewHelper().setBadgeHorizontalMarginDp(mBadgeHorMargin);
    getBadgeViewHelper().setDragDismissDelegage(new com.jpeng.jptabbar.badgeview.DragDismissDelegate() {
        @java.lang.Override
        public void onDismiss(com.jpeng.jptabbar.badgeview.Badgeable badgeable) {
            if ((mDismissListener) != null)
                mDismissListener.onDismiss(mIndex);
            
        }
    });
}