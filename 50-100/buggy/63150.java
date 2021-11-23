@java.lang.Override
public void onLoaderChanged() {
    this.cardIssueAdapter.setList(this.issueLoader.getIssues());
    this.cardIssueAdapter.setFilter(this.selectors);
    int newLoadedIssueCount = (this.issueLoader.getIssues().size()) - (this.lastIssueCount);
    this.lastIssueCount = this.issueLoader.getIssues().size();
    playCardLoadAnimation(((newLoadedIssueCount > (slm2015.hey.view.tabs.watch.WatchFragment.MAX_CARD_ANIMATION) ? slm2015.hey.view.tabs.watch.WatchFragment.MAX_CARD_ANIMATION : newLoadedIssueCount) - 1));
}