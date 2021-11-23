public java.lang.String execute() {
    java.lang.System.out.println(java.lang.String.format("User Name in session: %s", session.get("userName")));
    java.lang.System.out.println(java.lang.String.format("Password in session: %s", session.get("password")));
    java.lang.System.out.println(java.lang.String.format("Email in session: %s", session.get("email")));
    session = com.opensymphony.xwork2.ActionContext.getContext().getSession();
    return session.containsKey("userName") ? SUCCESS : ERROR;
}