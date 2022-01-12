private void notifyTorch(boolean inUse) {
    android.os.IBinder b = android.os.ServiceManager.getService(Context.TORCH_SERVICE);
    android.hardware.ITorchService torchService = ITorchService.Stub.asInterface(b);
    if (torchService != null) {
        try {
            if (inUse) {
                torchService.onCameraOpened(mTorchToken, mCameraId);
            }else {
                torchService.onCameraClosed(mTorchToken, mCameraId);
            }
        } catch (android.os.RemoteException e) {
        }
    }
}