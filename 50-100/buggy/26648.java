@java.lang.Override
public void call(java.lang.Object event) {
    mView.hideProgressDialog();
    if (event instanceof com.postnov.android.yotatestapp.bus.events.SuccessEvent) {
        mView.showSource(((com.postnov.android.yotatestapp.bus.events.SuccessEvent) (event)).getResult());
    }else
        if (event instanceof com.postnov.android.yotatestapp.bus.events.ErrorEvent) {
            mView.showError(((com.postnov.android.yotatestapp.bus.events.ErrorEvent) (event)).getError());
        }
    
}