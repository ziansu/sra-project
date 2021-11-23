@java.lang.Override
public int countBeforeFull() {
    return (getPrefetchSize()) == 0 ? prefetchExtension.get() : ((info.getPrefetchSize()) + (prefetchExtension.get())) - (dispatched.size());
}