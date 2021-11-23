private void checkForUpdateInRecyclerView() {
    if ((counter.incrementAndGet()) >= ((collection.moviesIds.size()) - 1)) {
        updateList();
    }
}