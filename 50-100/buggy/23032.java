@java.lang.Override
public void update(java.util.Observable o, java.lang.Object o1) {
    if (o1 instanceof Sync.change) {
        Sync.change changeType = ((Sync.change) (o1));
        if (((((changeType == (Sync.change.changedPreliminary)) || (changeType == (Sync.change.finishedPreliminary))) || (changeType == (Sync.change.unfinishedPreliminary))) || (changeType == (Sync.change.changedFencerValue))) || (changeType == (Sync.change.changedCards))) {
            UpdateData();
        }
    }
}