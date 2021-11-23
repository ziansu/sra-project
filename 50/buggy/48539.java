@javax.annotation.Nullable
public java.lang.String getLogoutRedirect() {
    java.lang.String ret = xcfg().getString("logout-redirect");
    if (org.apache.commons.lang3.StringUtils.isBlank(ret)) {
        return xcfg.getString("site.root");
    }
    return null;
}