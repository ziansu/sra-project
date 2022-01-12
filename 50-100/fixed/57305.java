public void updateUserSession() {
    java.lang.System.out.println("in update user session");
    try {
        org.directwebremoting.WebContext context = org.directwebremoting.WebContextFactory.get();
        javax.servlet.http.HttpSession session = context.getSession();
        java.lang.String username = chatbox.Util.getCurrentUserName(session);
        context.getScriptSession().setAttribute("user", username);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}