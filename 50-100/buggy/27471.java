@java.lang.Override
public boolean setUncancellable() {
    java.lang.Object result = this.result;
    if (io.netty.util.concurrent.DefaultPromise.isDone0(result)) {
        return io.netty.util.concurrent.DefaultPromise.isCancelled0(result);
    }
    synchronized(this) {
        result = this.result;
        if (io.netty.util.concurrent.DefaultPromise.isDone0(result)) {
            return io.netty.util.concurrent.DefaultPromise.isCancelled0(result);
        }
        this.result = io.netty.util.concurrent.DefaultPromise.UNCANCELLABLE;
    }
    return true;
}