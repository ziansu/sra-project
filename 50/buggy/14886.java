@java.lang.Override
public int countBeforeFull() {
    return ((info.getPrefetchSize()) + (prefetchExtension.get())) - (dispatched.size());
}