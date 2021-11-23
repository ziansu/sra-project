@java.lang.Override
public <V> V postAndWait(com.facebook.stetho.common.UncheckedCallable<V> c) {
    return mEnforcer.postAndWait(c);
}