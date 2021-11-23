public static long interceptLongParam(android.os.Bundle savedInstanceState, android.content.Intent intent, java.lang.String paramName) {
    long ret = -1;
    if (savedInstanceState != null) {
        ret = savedInstanceState.getLong(paramName);
    }else {
        if (intent != null) {
            android.os.Bundle incoming = intent.getExtras();
            if (incoming != null) {
                ret = incoming.getLong(paramName, (-1));
            }
        }
    }
    return ret;
}