@java.lang.Override
public boolean getFullDatasetValueOfLastUpdates() {
    if (this.alwaysIncremental) {
        return false;
    }
    return fullDataset;
}