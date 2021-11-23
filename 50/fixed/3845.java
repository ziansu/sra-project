public static void saveCookie(java.net.HttpURLConnection conn) {
    java.lang.String cookieTemp = conn.getHeaderField("Set-Cookie");
    if (((kr.ac.knu.bist.knu_econtrade.Session.ConnManager.m_session) == false) && (cookieTemp != null)) {
        kr.ac.knu.bist.knu_econtrade.Session.ConnManager.m_cookies = cookieTemp;
        kr.ac.knu.bist.knu_econtrade.Session.ConnManager.m_session = true;
    }
}