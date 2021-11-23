void remove(org.duracloud.sync.mgmt.ChangedFile changedFile) {
    this.reservedFiles.remove(getKey(changedFile));
}