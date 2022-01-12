@java.lang.Override
public void execute(io.realm.Realm realm) {
    if ((realm.where(com.bizconnectivity.tismobile.database.models.SealDetail.class).equalTo("sealNo", results.getSealNo()).equalTo("jobID", jobID).count()) == 0) {
        com.bizconnectivity.tismobile.database.models.SealDetail sealDetail = realm.createObject(com.bizconnectivity.tismobile.database.models.SealDetail.class, results.getSealNo());
        sealDetail.setJobID(jobID);
        realm.copyToRealmOrUpdate(sealDetail);
    }
}