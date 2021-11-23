@java.lang.Override
public boolean setNextRow(io.crate.core.collections.Row row) {
    row = new io.crate.core.collections.RowN(row.materialize());
    if (projector.downstreamAborted.get()) {
        return false;
    }
    if (!(lowestCommon.isEmittable(row, this))) {
        pendingPause.set(true);
        pause();
    }
    return downstreamContext.setNextRow(row);
}