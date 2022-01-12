private boolean checkAllFiles() {
    if ((csGoldButtonEH.getFilePath()) == null) {
        return false;
    }
    if ((starRezButtonEH.getFilePath()) == null) {
        return false;
    }
    if ((bannerButtonEH.getFilePath()) == null) {
        return false;
    }
    if ((touchnetButtonEH.getFilePath()) == null) {
        return false;
    }
    return true;
}