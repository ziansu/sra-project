public java.lang.String execute() {
    com.opensymphony.xwork2.ActionContext.getContext().getSession().remove(LoginFilter.LOGIN_GA_USER);
    com.opensymphony.xwork2.ActionContext.getContext().getSession().remove(LoginFilter.LOGIN_GS_SITE);
    return SUCCESS;
}