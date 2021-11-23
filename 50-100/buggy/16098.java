public static <S> info.arybin.fearnotwords.core.SimpleOperableQueue buildFrom(java.util.Collection<S> source) {
    if ((null == source) || ((source.size()) == 0)) {
        return null;
    }
    return new info.arybin.fearnotwords.core.SimpleOperableQueue<>(source, new java.util.concurrent.ConcurrentLinkedQueue());
}