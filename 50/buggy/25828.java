private void checkAuthentified() throws org.rapla.storage.RaplaSecurityException {
    if (!(session.isAuthentified(request))) {
        throw new org.rapla.storage.RaplaSecurityException(org.rapla.storage.dbrm.RemoteStorage.USER_WAS_NOT_AUTHENTIFIED);
    }
}