@java.lang.Override
public void accept(io.crate.data.BatchIterator iterator, @javax.annotation.Nullable
java.lang.Throwable failure) {
    if (failure == null) {
        for (io.crate.planner.projection.Projection projection : projections) {
            io.crate.data.Projector projector = projectorFactory.create(projection, ramAccountingContext, jobId);
            try {
                iterator = projector.apply(iterator);
            } catch (java.lang.Throwable t) {
                consumer.accept(null, t);
                return ;
            }
        }
        consumer.accept(iterator, null);
    }else {
        consumer.accept(iterator, failure);
    }
}