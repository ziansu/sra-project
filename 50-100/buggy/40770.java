@java.lang.Override
public void onCreate() {
    super.onCreate();
    mapd.android.phoenix.watchyourself.SA mAccessory = new mapd.android.phoenix.watchyourself.SA();
    try {
        mAccessory.initialize(this);
    } catch (com.samsung.android.sdk.SsdkUnsupportedException e) {
    } catch (com.samsung.android.sdk.SsdkUnsupportedException e) {
        if ((processUnsupportedException(e)) == true) {
            return ;
        }
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
        stopSelf();
    }
}