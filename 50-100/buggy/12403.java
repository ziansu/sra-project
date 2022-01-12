@java.lang.Override
public void forEachEntry(java.util.function.ObjIntConsumer<? super E> action) {
    com.google.common.base.Preconditions.checkNotNull(action);
    for (int i = 0; i < (size()); i++) {
        action.accept(elementSet.asList().get(i), getCount(i));
    }
}