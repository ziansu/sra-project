protected void throwCodeAndMessage(int code, java.lang.String msg) {
    switch (code) {
        case 0 :
        case 101 :
        case 102 :
        case 190 :
            throw new com.googlecode.batchfb.err.OAuthException(msg, "OAuthException", code, null);
        default :
            throw new com.googlecode.batchfb.err.ErrorFacebookException((((msg + " (code ") + code) + ")"), null, code, null);
    }
}