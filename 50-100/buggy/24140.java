public void addShare(de.hsaugsburg.ShareGame.Assets.Share share, int count) {
    int shareItemIndex = findShareItem(share);
    if (shareItemIndex >= 0) {
        shareItems[shareItemIndex].add(count);
        return ;
    }
    checkAddSize();
    shareItems[shareItemCount] = new de.hsaugsburg.ShareGame.Assets.ShareItem(share, (((super.getName()) + "_") + (share.getName())));
    (shareItemCount)++;
}