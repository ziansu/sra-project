@org.springframework.web.bind.annotation.RequestMapping(value = "/modules/page")
public java.lang.String modulesPage(javax.servlet.http.HttpSession session, javax.servlet.http.HttpServletRequest req) {
    java.util.Map<java.lang.String, java.lang.Object> userinfo = getUserInfo(session);
    java.lang.String userId = ((java.lang.String) (userinfo.get("userId")));
    return "wf-modules-view";
}