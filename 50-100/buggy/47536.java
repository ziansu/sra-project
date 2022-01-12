@java.lang.Override
public void run() {
    commonResultTask(result);
    if ((result.errorCode) == 0) {
        item = holder.sample;
        categorySelected = item.getCategory();
        iconChanged = false;
        iconDefault = (item.getIcon()) == null;
        iconTempUrl = null;
        uiFromData();
        android.util.Log.d(diy.uigeneric.sampleserver.SampleServerEditActivity.TAG, ((("load item: " + (item.getId())) + "/") + (item.getName())));
    }else
        this.finish();
    
}