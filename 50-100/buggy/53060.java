@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other == (this)) {
        return true;
    }
    if (!(other instanceof io.cassandrareaper.core.RepairRun)) {
        return false;
    }
    io.cassandrareaper.core.RepairRun run = ((io.cassandrareaper.core.RepairRun) (other));
    return ((this.id) == (run.id)) && ((this.repairUnitId) == (run.repairUnitId));
}