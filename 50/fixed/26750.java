@java.lang.Override
public java.lang.Integer call() {
    hudson.remoting.Channel c = hudson.remoting.Channel.current();
    if (c == null) {
        return -1;
    }
    return resource ? c.resourceLoadingCount.get() : c.classLoadingCount.get();
}