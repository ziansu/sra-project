@java.lang.Override
public java.lang.Integer call() {
    hudson.remoting.Channel c = hudson.remoting.Channel.current();
    return resource ? c.resourceLoadingCount.get() : c.classLoadingCount.get();
}