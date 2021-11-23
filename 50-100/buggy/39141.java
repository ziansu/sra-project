public void AddARecordToStorage(java.lang.String storageName, java.lang.String appBarcode, java.lang.String batch_lot, java.lang.String appProductQTY, java.lang.String appPriceUnit, java.lang.String appTotalPrice, java.lang.String appSupplier_name, java.lang.String appInStoreDate) {
    com.Warcraft.Interface.IStorageTableInterface hStorageHandle = GenStorageHandle(appBarcode);
    hStorageHandle.AddARecord(appBarcode, batch_lot, appProductQTY, appPriceUnit, appTotalPrice, "empty", "Material_Supply", appSupplier_name, appInStoreDate);
}