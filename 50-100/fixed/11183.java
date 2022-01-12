@java.lang.Override
public boolean equals(final java.lang.Object o) {
    if (!(o instanceof groovyx.net.http.NonBlockingCookieStore.UriKey)) {
        return false;
    }
    final groovyx.net.http.NonBlockingCookieStore.UriKey rhs = ((groovyx.net.http.NonBlockingCookieStore.UriKey) (o));
    return (host.equals(rhs.host)) && (name.equals(rhs.name));
}