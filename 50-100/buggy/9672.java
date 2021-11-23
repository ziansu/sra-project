@java.lang.Override
public void onDestroy() {
    org.md2k.utilities.Report.Log.d(org.md2k.plotter.ActivityPlot.TAG, "onDestroy()");
    if ((dataSourceClient) != null)
        try {
            if ((dataKitAPI) != null)
                dataKitAPI.unsubscribe(dataSourceClient);
            
        } catch (org.md2k.datakitapi.exception.DataKitException e) {
            e.printStackTrace();
        }
    
    if ((dataKitAPI) != null)
        dataKitAPI.disconnect();
    
    redrawer.pause();
    redrawer.finish();
    super.onDestroy();
}