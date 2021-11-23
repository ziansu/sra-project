void increaseVersion(android.content.Context context, int atLeast) {
    if ((mLocalVersion) <= atLeast) {
        mLocalVersion = atLeast + 1;
        saveData(context);
    }
}