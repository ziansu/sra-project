public void initProcess(android.os.IBinder token, int vuid) {
    if ((this.token) != null) {
        throw new java.lang.IllegalStateException("Token is exist!");
    }
    this.token = token;
    this.vuid = vuid;
}