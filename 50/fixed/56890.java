@org.nutz.mvc.annotation.At
@org.nutz.mvc.annotation.Ok(value = ">>:/yvr/list")
@org.nutz.mvc.annotation.Fail(value = ">>:/yvr/list")
public void logout() {
    org.apache.shiro.SecurityUtils.getSubject().logout();
}