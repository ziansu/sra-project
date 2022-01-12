public boolean isComplete() {
    try {
        if (((mArtist.trim()) != "") && ((mTitle.trim()) != "")) {
            return true;
        }
    } catch (java.lang.NullPointerException e) {
        return false;
    }
    return false;
}