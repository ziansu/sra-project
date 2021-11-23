@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    for (java.lang.String key : mFields.keySet()) {
        java.lang.String value = (key == (android.net.wifi.WifiEnterpriseConfig.PASSWORD_KEY)) ? "<removed>" : mFields.get(key);
        sb.append(key).append(" ").append(value).append("\n");
    }
    return sb.toString();
}