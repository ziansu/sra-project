@com.mindorks.placeholderview.annotations.swipe.SwipeIn
private void onSwipeIn() {
    final boolean itsAnAd = tk.talcharnes.unborify.PhotoCard.isAd;
    if (!itsAnAd) {
        setVote("likes");
        tk.talcharnes.unborify.Utilities.Analytics.registerSwipe(mContext, "right");
    }
}