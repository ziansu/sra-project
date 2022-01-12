public void getRecord(java.lang.String location) {
    switch (location) {
        case "records" :
            final com.vmr.db.record.Record record = com.vmr.app.Vmr.getDbManager().getRecord(nodeRef);
            getFile(record);
            break;
        case "trash" :
            com.vmr.db.trash.TrashRecord trashRecord = com.vmr.app.Vmr.getDbManager().getTrashRecord(nodeRef);
            getFile(trashRecord);
            break;
        case "shared" :
            com.vmr.db.shared.SharedRecord sharedRecord = com.vmr.app.Vmr.getDbManager().getSharedRecord(nodeRef);
            getFile(sharedRecord);
            break;
        default :
            break;
    }
}