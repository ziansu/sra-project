@java.lang.Override
public void orphan(database.DBSet db) {
    if ((service) == 10) {
        utils.StorageUtils.processOrphan(getData(), signature, db);
    }else {
        removeFromBlogMapOnDemand(db);
    }
    this.creator.setConfirmedBalance(this.creator.getConfirmedBalance(db).add(this.fee), db);
    this.creator.setLastReference(this.reference, db);
}