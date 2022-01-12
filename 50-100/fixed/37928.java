private void checkScrollType() {
    if (((mPager) != null) && (!(checked))) {
        isScrollNormal = (mPager.getScrollX()) - ((currentPosition) * (mPager.getWidth()));
        checked = true;
    }
}