@java.lang.Override
public void orphan(database.DBSet db) {
    if ((service) == 10) {
        utils.StorageUtils.processOrphan(getData(), signature, getNameStorageDB());
    }else {
        removeFromBlogMapOnDemand(getNameStorageDB());
    }
    this.creator.setConfirmedBalance(this.creator.getConfirmedBalance(db).add(this.fee), db);
    this.creator.setLastReference(this.reference, db);
}