@java.lang.Override
public void run() {
    byuie499.auto_nvs.Xlo.xAcc[val] = byuie499.auto_nvs.Xlo.xc;
    byuie499.auto_nvs.Xlo.yAcc[val] = byuie499.auto_nvs.Xlo.yc;
    byuie499.auto_nvs.Xlo.zAcc[val] = byuie499.auto_nvs.Xlo.zc;
    ++(val);
    if (((val) % ((N) / (accum))) == 0) {
        android.os.Message done = mHandler.obtainMessage(3);
        mHandler.sendMessage(done);
    }
    if ((val) == (N))
        val = 0;
    
}