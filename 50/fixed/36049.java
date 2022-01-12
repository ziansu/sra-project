@java.lang.Override
public void run() {
    if ((!(mIsLocationFound)) && ((mListener) != null)) {
        mListener.onLocationFailed();
    }
}