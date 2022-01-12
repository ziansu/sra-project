@java.lang.Override
public T get() {
    if (!(initialized)) {
        synchronized(this) {
            if (!(initialized)) {
                try {
                    value = provider.provide();
                } catch (java.lang.Exception e) {
                    error = e;
                    value = fallback;
                }
                initialized = true;
            }
        }
    }
    return value;
}