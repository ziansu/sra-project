public void gotNewToots(java.util.ArrayList<fr.xtof54.mousetodon.DetToot> newtoots) {
    if (true || (isFirstCall)) {
        stopWaitingWindow();
        isFirstCall = false;
    }
    toots.clear();
    toots.addAll(newtoots);
    updateList();
}