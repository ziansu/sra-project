@com.mindorks.placeholderview.annotations.swipe.SwipeOut
private void onSwipedOut() {
    if (((tk.talcharnes.unborify.PhotoCard.isReported) != null) && (tk.talcharnes.unborify.PhotoCard.isReported)) {
        tk.talcharnes.unborify.PhotoCard.isReported = false;
        setReport();
    }else {
        setVote("dislikes");
    }
}