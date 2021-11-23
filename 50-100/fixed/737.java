public java.lang.String getListOfCollegeOperators() {
    javax.servlet.http.HttpSession httpSession = request.getSession();
    loginBean = ((com.dexpert.feecollection.main.users.LoginBean) (httpSession.getAttribute("loginUserBean")));
    listAffBean = affDAO.getCollegesList();
    try {
        java.lang.Integer instId = loginBean.getAffBean().getInstId();
        listOprtBean = com.dexpert.feecollection.main.users.operator.OperatorDao.getAllRecordsOfCollegeOperator(instId);
    } catch (java.lang.NullPointerException e) {
        listOprtBean = com.dexpert.feecollection.main.users.operator.OperatorDao.getAllRecordsOfCollegeOperator(null);
    }
    return SUCCESS;
}