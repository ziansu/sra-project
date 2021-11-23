public java.lang.String validate() {
    pojo.Userdetails currentUser = new pojo.Userdetails((-1), "", "", "", "", "");
    currentUser.setUserName(this.userName);
    currentUser.setUserPassword(this.userPassword);
    Controller.UserController us = new Controller.UserController(currentUser);
    javax.servlet.http.HttpSession session = ((javax.servlet.http.HttpSession) (javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSession(false)));
    session.setAttribute("username", userName);
    return us.doLogin();
}