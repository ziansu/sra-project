@java.lang.Override
public void doTag() throws java.io.IOException, javax.servlet.jsp.JspException {
    me.veryyoung.movie.utils.SessionUtils sessionUtils = getSessionUtils();
    if (null == sessionUtils) {
        return ;
    }
    me.veryyoung.movie.entity.User currentUser = sessionUtils.getUser();
    if (null == currentUser) {
        return ;
    }
    if ((currentUser.isAdmin()) || (currentUser.getId().equals(userId))) {
        getJspBody().invoke(null);
    }
    return ;
}