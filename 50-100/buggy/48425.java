@java.lang.Override
public void sendProgress(long[] wins, double[] pars, long trail) {
    android.os.Message msg = handler.obtainMessage();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putLongArray(Constants.WINS, wins);
    bundle.putDoubleArray(Constants.PARTIAL_POTS, pars);
    bundle.putLong(Constants.TRAIL, trail);
    msg.setData(bundle);
    handler.sendMessage(msg);
}