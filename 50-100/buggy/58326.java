@java.lang.Override
public rx.Observable addPrinterDetails(com.nairbspace.octoandroid.domain.model.AddPrinter addPrinter) {
    long id = mDiskManager.getActivePrinterId();
    rx.Observable entityObs = rx.Observable.create(mMapperHelper.mapAddPrinterToPrinterDbEntity(addPrinter)).map(mDiskManager.putPrinterInDb());
    rx.Observable verifyObs = mApiManager.getVersion().map(mDiskManager.putVersionInDb());
    return rx.Observable.concat(entityObs, verifyObs).doOnError(mDiskManager.deleteUnverifiedPrinter(id));
}