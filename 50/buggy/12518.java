public int getDownloadProgress() {
    return ((int) ((((float) (currentPosition)) / (levelVideoList.size())) * 100));
}