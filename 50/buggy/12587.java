public void initProcess(android.os.IBinder token, int vuid) {
    this.token = token;
    this.vuid = vuid;
    this.deviceInfo = com.lody.virtual.client.ipc.VDeviceManager.get().getDeviceInfo(com.lody.virtual.os.VUserHandle.getUserId(vuid));
}