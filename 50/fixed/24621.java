private void cancelLoadingPoems() {
    updating = false;
    com.almoturg.sprog.data.PoemsLoader.cancelAllDownloads(activity);
}