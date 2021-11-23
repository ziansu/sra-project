@java.lang.Override
public java.lang.String run() {
    return getContext().getCookieProcessor().generateHeader(cookie);
}