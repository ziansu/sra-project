@java.lang.Override
public void onFinished(org.iotivity.service.easysetup.core.EnrolleeDevice enrolledevice) {
    synchronized(this) {
        if (mEnrolleeDeviceList.contains(enrolledevice)) {
            android.util.Log.i(org.iotivity.service.easysetup.core.EasySetupService.TAG, ("onFinished() is received " + (enrolledevice.isSetupSuccessful())));
            mCallback.onFinished(enrolledevice);
            mEnrolleeDeviceList.remove(enrolledevice);
        }
    }
}