@java.lang.Override
public void onCompleted() {
    if (rx.internal.operators.OperatorGroupBy.GroupBySubscriber.TERMINATED_UPDATER.compareAndSet(this, 0, 1)) {
        for (rx.internal.operators.OperatorGroupBy.GroupBySubscriber.GroupState<K, T> group : groups.values()) {
            emitItem(group, rx.internal.operators.OperatorGroupBy.GroupBySubscriber.nl.completed());
        }
        if (groups.isEmpty()) {
            if (rx.internal.operators.OperatorGroupBy.GroupBySubscriber.COMPLETION_EMITTED_UPDATER.compareAndSet(this, 0, 1)) {
                child.onCompleted();
            }
        }
    }
}