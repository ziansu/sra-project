public java.lang.Long getNewSurveyIndex(final long saveDataId) {
    io.realm.RealmResults<colector.co.com.collector.model.SurveySave> results = colector.co.com.collector.database.DatabaseHelper.realm.where(colector.co.com.collector.model.SurveySave.class).equalTo("instanceId", saveDataId).findAll();
    return (results.size()) + 1L;
}