@java.lang.Override
public com.lami.tuomatuo.mq.netty.util.concurrent.Future<V> addListeners(com.lami.tuomatuo.mq.netty.util.concurrent.GenericFutureListener<? extends com.lami.tuomatuo.mq.netty.util.concurrent.Future<? super V>>... listeners) {
    if (listeners == null) {
        throw new java.lang.NullPointerException("Listeners is null");
    }
    for (com.lami.tuomatuo.mq.netty.util.concurrent.GenericFutureListener<? extends com.lami.tuomatuo.mq.netty.util.concurrent.Future<? super V>> l : listeners) {
        if (l == null) {
            break;
        }
    }
    return this;
}