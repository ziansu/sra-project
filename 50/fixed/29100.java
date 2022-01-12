@java.lang.Override
public void run() {
    if ((mMovie) != null) {
        mRuntimeView.setText(((mMovie.getRuntime()) + "min"));
    }
}