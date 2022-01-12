private void reloadData() {
    synchronized(lock) {
        dataset.clear();
        if ((releasedToday) != null) {
            dataset.addAll(releasedToday);
        }
        if ((recentlyWatched) != null) {
            dataset.addAll(recentlyWatched);
        }
        if ((friendsRecently) != null) {
            dataset.addAll(friendsRecently);
        }
    }
}