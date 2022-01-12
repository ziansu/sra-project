@java.lang.Override
public T get() {
    if (!(initialized)) {
        synchronized(this) {
            if (!(initialized)) {
                try {
                    value = provider.provide();
                } catch (java.lang.Exception e) {
                    pw.phylame.commons.log.Log.d("Lazy", e);
                    value = fallback;
                }
                initialized = true;
            }
        }
    }
    return value;
}