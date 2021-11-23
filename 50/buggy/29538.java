public static ch.hsr.adit.util.KeyStore getInstance(java.io.File file) {
    if ((ch.hsr.adit.util.KeyStore.instance) == null) {
        synchronized(ch.hsr.adit.util.KeyStore.class) {
            if ((ch.hsr.adit.util.KeyStore.instance) == null) {
                ch.hsr.adit.util.KeyStore.instance = new ch.hsr.adit.util.KeyStore(file);
            }
        }
    }
    return ch.hsr.adit.util.KeyStore.instance;
}