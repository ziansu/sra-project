public final java.lang.String start() throws java.lang.Exception {
    if ((getRemoteUser()) != null) {
        javax.servlet.http.HttpServletRequest request = com.opensymphony.webwork.ServletActionContext.getRequest();
        javax.servlet.http.HttpSession session = request.getSession();
        chatBoxMap = chatManager.getOpenChats(session);
        chatManager.setOnlineStatus(getRemoteUser(), ChatStatus.NO_CHANGE);
    }
    return SUCCESS;
}