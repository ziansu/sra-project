@java.lang.Override
protected java.lang.Object doInBackground() {
    credentialOk = false;
    try {
        credentialOk = util.ConnectionManager.verifyCredentialsMAL(username, password);
        if (credentialOk) {
            setProgress(0);
            synchronizeAnimeToMAL(animeToAdd, true);
            synchronizeAnimeToMAL(notFoundedAnime, false);
        }
    } catch (java.io.IOException e) {
        util.MAMUtil.writeLog(e);
        e.printStackTrace();
    }
    return null;
}