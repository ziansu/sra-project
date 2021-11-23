@org.nutz.mvc.annotation.At
@org.nutz.mvc.annotation.Ok(value = ">>:/yvr")
public void logout() {
    org.apache.shiro.SecurityUtils.getSubject().logout();
    javax.servlet.http.HttpSession session = org.nutz.mvc.Mvcs.getHttpSession(false);
    if (session != null)
        session.invalidate();
    
}