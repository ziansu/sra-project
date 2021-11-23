@android.support.annotation.Nullable
protected final HttpHeaderUtils.Challenge getCasAuthChallenge(@android.support.annotation.NonNull
final java.net.HttpURLConnection conn) throws java.io.IOException {
    if ((conn.getResponseCode()) == (java.net.HttpURLConnection.HTTP_UNAUTHORIZED)) {
        final java.lang.String auth = conn.getHeaderField("WWW-Authenticate");
        if (auth != null) {
            final org.ccci.gto.android.common.util.HttpHeaderUtils.Challenge challenge = org.ccci.gto.android.common.util.HttpHeaderUtils.parseChallenge(auth);
            if (challenge.getScheme().equals("CAS")) {
                return challenge;
            }
        }
    }
    return null;
}