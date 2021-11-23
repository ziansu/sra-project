public void recoverSite(int sid) {
    Site s = _sites.get(sid);
    s.recover();
}