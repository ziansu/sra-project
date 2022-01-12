@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Integer... params) {
    try {
        map = dbService.findRemoteBuildingByMajor(params[0]);
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        remoteError = true;
    }
    return false;
}