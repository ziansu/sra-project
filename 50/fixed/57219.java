private void checkForUpdateInRecyclerView() {
    if ((counter.incrementAndGet()) == (collection.moviesIds.size())) {
        updateList();
    }
}