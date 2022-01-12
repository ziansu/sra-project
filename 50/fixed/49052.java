@java.lang.Override
public void onSuccess(java.util.List<org.hisp.dhis.client.sdk.models.event.Event> result) {
    org.eyeseetea.malariacare.data.database.utils.populatedb.PopulateDB.wipeDatabase();
    convertFromSDK(callback, true);
}