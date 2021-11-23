@java.lang.Override
public com.labs.okey.oneride.model.Ride call() throws java.lang.Exception {
    try {
        com.microsoft.windowsazure.mobileservices.table.MobileServiceTable<com.labs.okey.oneride.model.Ride> ridesTable = com.labs.okey.oneride.utils.Globals.getMobileServiceClient().getTable("rides", com.labs.okey.oneride.model.Ride.class);
        com.labs.okey.oneride.model.Ride _ride = ridesTable.insert(ride).get();
        com.labs.okey.oneride.utils.Globals.__log(LOG_TAG, java.lang.String.format("Ride uploaded with id: %s", _ride.id));
        return _ride;
    } catch (java.util.concurrent.ExecutionException | java.lang.InterruptedException e) {
        com.labs.okey.oneride.utils.Globals.__logException(e);
        return null;
    }
}