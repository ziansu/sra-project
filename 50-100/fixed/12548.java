@java.lang.Override
public boolean setNextRow(io.crate.core.collections.Row row) {
    if (projector.downstreamAborted.get()) {
        return false;
    }
    if (!(lowestCommon.isEmittable(row, this))) {
        pause();
    }
    return downstreamContext.setNextRow(row);
}