private java.util.List<net.tascalate.concurrent.DependentPromise<T>> self(boolean enlist) {
    return enlist ? java.util.Collections.emptyList() : java.util.Collections.singletonList(this);
}