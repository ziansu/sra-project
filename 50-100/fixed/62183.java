@java.lang.Override
@org.jetbrains.annotations.Nullable
public T get() {
    if ((result) != (LazyFactory.LazyImpl.noResultYet)) {
        return result;
    }
    synchronized(this) {
        if ((result) == (LazyFactory.LazyImpl.noResultYet)) {
            result = supplier.get();
            supplier = null;
        }
    }
    return result;
}