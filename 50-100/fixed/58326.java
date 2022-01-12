@java.lang.Override
public rx.Observable addPrinterDetails(com.nairbspace.octoandroid.domain.model.AddPrinter addPrinter) {
    rx.Observable entityObs = rx.Observable.create(mMapperHelper.mapAddPrinterToPrinterDbEntity(addPrinter)).map(mDiskManager.putPrinterInDb());
    long id = mDiskManager.getActivePrinterId();
    rx.Observable verifyObs = mApiManager.getVersion().map(mDiskManager.putVersionInDb()).doOnError(mDiskManager.deleteUnverifiedPrinter(id));
    return rx.Observable.concat(entityObs, verifyObs);
}