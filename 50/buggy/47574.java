public final void destroy() {
    animViewList.clear();
    animDisposable.dispose();
    animDisposable = null;
    animObservableList.clear();
    prevScrollEvent = tech.thdev.androidrecyclerview.view.scroll.anim.OnRecyclerScrollListener.SCROLL_NONE;
}