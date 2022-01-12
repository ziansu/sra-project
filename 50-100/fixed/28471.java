@java.lang.Override
public void process(database.DBSet db) {
    if ((service) == 10) {
        utils.StorageUtils.processUpdate(getData(), signature, creator, db);
    }else
        if ((service) == 777) {
            addToBlogMapOnDemand(db);
        }
    
    this.creator.setConfirmedBalance(this.creator.getConfirmedBalance(db).subtract(this.fee), db);
    this.creator.setLastReference(this.signature, db);
}