void updateSessionForFailover() {
    if ((stateless) || (isNoSession())) {
        return ;
    }
    getSession().setIsISStored(true);
}