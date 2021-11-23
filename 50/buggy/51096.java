private void AddSelector(slm2015.hey.entity.Selector selector) {
    slm2015.hey.view.tabs.watch.WatchFragment fragment = ((slm2015.hey.view.tabs.watch.WatchFragment) (this.fragments.get(WATCH_FRAGMENT)));
    this.selectorAdapter.addSelector(selector);
}