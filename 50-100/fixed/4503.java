public int incrementClaimCounter() {
    int mostRecentId;
    int newId;
    android.content.SharedPreferences counterFile;
    android.content.SharedPreferences.Editor editor;
    counterFile = this.context.getSharedPreferences("claimCounter", 0);
    mostRecentId = counterFile.getInt("claimCount", 0);
    newId = mostRecentId + 1;
    editor = counterFile.edit();
    editor.putInt("claimCount", newId);
    editor.commit();
    return newId;
}