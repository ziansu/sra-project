protected com.netease.model.User getUserInfo() {
    javax.servlet.http.HttpSession session = com.netease.util.HttpUtil.getSession();
    if (session == null) {
        return null;
    }
    return ((com.netease.model.User) (session.getAttribute("user")));
}