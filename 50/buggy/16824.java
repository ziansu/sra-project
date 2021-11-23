void increaseVersion(int atLeast) {
    if ((mLocalVersion) <= atLeast) {
        mLocalVersion = atLeast + 1;
        saveData();
    }
}