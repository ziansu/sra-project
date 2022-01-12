@java.lang.Override
public minium.web.actions.Cookie get(java.lang.String name) {
    minium.web.actions.Cookie nativeCookie = documentDriver().manage().getCookieNamed(name);
    return nativeCookie == null ? null : new InternalCookie(nativeCookie);
}