public com.weinyc.sa.app.dao.NavigationDAO getNavigationDAO() {
    if ((navigationDAO) == null) {
        this.navigationDAO = ((com.weinyc.sa.app.dao.NavigationDAO) (this.getAppContext().getBean("navigationDAO")));
    }
    return this.navigationDAO;
}