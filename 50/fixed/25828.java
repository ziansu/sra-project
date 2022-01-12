private void checkAuthentified() throws org.rapla.storage.RaplaSecurityException {
    boolean fail = false;
    if ((!(session.isAuthentified(request))) || fail) {
        throw new org.rapla.storage.RaplaSecurityException(org.rapla.storage.dbrm.RemoteStorage.USER_WAS_NOT_AUTHENTIFIED);
    }
}