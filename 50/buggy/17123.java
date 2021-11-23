@java.lang.Override
public void logout() {
    if ((mDBApi) != null) {
        mDBApi.getSession().unlink();
    }
    mPrefs.edit().remove(nl.mpcjanssen.simpletask.remote.FileStore.OAUTH2_TOKEN);
}