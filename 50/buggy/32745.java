protected boolean canPerformRefresh() {
    return (!(((mOverScrollChecker.needScrollBackToTop()) || (mOverScrollChecker.isScrolling())) || (isMovingContent()))) && (!(isDisablePerformRefresh()));
}