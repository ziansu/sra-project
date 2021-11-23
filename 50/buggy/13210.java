public void onInit(com.linkedin.r2.message.streaming.ReadHandle rh) {
    _readHandle = rh;
    _readHandle.request(_bufferSize);
}