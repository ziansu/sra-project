@java.lang.Override
public java.lang.String getValueString(au.com.vaadinutils.dashboard.Tblportal portal, java.lang.String key) {
    if (portal == null) {
        return "";
    }
    return portal.getConfigValue(key, "");
}