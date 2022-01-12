public int[] decodeBinary(int keyCode, net.irext.decodesdk.bean.ACStatus acStatus, int changeWindDir) {
    if (null == acStatus) {
        acStatus = new net.irext.decodesdk.bean.ACStatus();
    }
    return irDecode(keyCode, acStatus, changeWindDir);
}