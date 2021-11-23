@java.lang.Override
public void run() {
    if ((mHandler) != null) {
        mHandler.removeCallbacks(mUpdateReceivedProg);
    }
    edu.cmu.cylab.starslinger.exchange.ExchangeActivity.mProt.endProtocol();
}