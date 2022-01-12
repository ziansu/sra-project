public int getDownloadProgress() {
    if ((levelVideoList) == null) {
        return 0;
    }
    return ((int) ((((float) (currentPosition)) / (levelVideoList.size())) * 100));
}