@java.lang.Override
public void init() {
    android.util.Log.i(alex_shutov.com.ledlights.bluetoothmodule.bluetooth.BtLogicCell.LOG_TAG, "BtLogicCell.init()");
    btConnAdapter.initialize();
    btScanAdapter.initialize();
    btStorageAdapter.initialize();
    btCommAdapter.initialize();
    initializeEsbMappers();
    alex_shutov.com.ledlights.bluetoothmodule.bluetooth.BtPortAdapterCreator diComponent = ((alex_shutov.com.ledlights.bluetoothmodule.bluetooth.BtPortAdapterCreator) (getAdaperCreator()));
    btFacade = new alex_shutov.com.ledlights.bluetoothmodule.bluetooth.BtLogicCellFacade(diComponent);
    btCommAdapter.setDecoree(btFacade);
    btFacade.onInitialized();
}