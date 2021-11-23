public void DeleteBugView(int BugIndex) {
    BugViewArray.remove((BugIndex - 1));
    ResetBugIndexes();
    ChangeURLListPulldowns(BugIndex);
}