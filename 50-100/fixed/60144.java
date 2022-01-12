public void setFirstCardState(slm2015.hey.view.tabs.watch.CardIssueAdapter.CardState firstCardState) {
    if ((getCount()) > 0) {
        this.firstCardState = firstCardState;
        slm2015.hey.entity.Issue issue = this.filteList.get(((this.getCount()) - 1));
        issue.setLike((firstCardState == (slm2015.hey.view.tabs.watch.CardIssueAdapter.CardState.LIKE)));
    }
}