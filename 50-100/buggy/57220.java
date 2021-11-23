public java.lang.String getCookie(java.lang.String siteName, java.lang.String CookieName) {
    java.lang.String CookieValue = null;
    android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
    java.lang.String cookies = cookieManager.getCookie(siteName);
    java.lang.String[] temp = cookies.split(";");
    for (java.lang.String ar1 : temp) {
        if (ar1.contains(CookieName)) {
            java.lang.String[] temp1 = ar1.split("=");
            CookieValue = temp1[1];
            break;
        }
    }
    return CookieValue;
}