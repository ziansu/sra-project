public boolean isComplete() {
    try {
        if ((!(mArtist.trim().equals(""))) && (!(mTitle.trim().equals("")))) {
            return true;
        }
    } catch (java.lang.NullPointerException e) {
        return false;
    }
    return false;
}