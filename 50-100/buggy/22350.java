@java.lang.Override
public void run() {
    while (((((com.stollmann.tiov2sample.PeripheralActivity.count) / 8) - 1) < numTotalPackages) && (!(com.stollmann.tiov2sample.PeripheralActivity.isTxEnded))) {
        progress.setProgress(((com.stollmann.tiov2sample.PeripheralActivity.count) / 8));
    } 
    if (com.stollmann.tiov2sample.PeripheralActivity.isTxEnded)
        progress.dismiss();
    
}