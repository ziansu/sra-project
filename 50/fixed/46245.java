public void myInit() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    date.admin = kurswork.VODBC.VODBC.aLoadAdmin();
    initUserTabView();
    initGrupTabView();
}