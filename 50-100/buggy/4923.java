@java.lang.Override
public void accept(io.crate.data.BatchIterator iterator, @javax.annotation.Nullable
java.lang.Throwable failure) {
    if (failure == null) {
        for (io.crate.data.Projector projector : projectors) {
            iterator = projector.apply(iterator);
        }
        consumer.accept(iterator, null);
    }else {
        consumer.accept(iterator, failure);
    }
}