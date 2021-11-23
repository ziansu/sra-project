protected com.netease.model.User getUserInfo() {
    javax.servlet.http.HttpSession session = com.netease.util.HttpUtil.getSession();
    if (session == null) {
        return new com.netease.model.User();
    }
    return ((com.netease.model.User) (session.getAttribute("user")));
}