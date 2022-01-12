@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    com.begentgroup.testappengine.User user = ((com.begentgroup.testappengine.User) (req.getSession().getAttribute("User")));
    if (user != null) {
        java.util.List<com.begentgroup.testappengine.User> list = com.begentgroup.testappengine.DataManager.getInstance().getUserList(user, null, 0, 10);
        com.begentgroup.testappengine.Utility.responseSuccessMessage(resp, list);
        return ;
    }
    com.begentgroup.testappengine.Utility.responseErrorMessage(resp, "not login");
}