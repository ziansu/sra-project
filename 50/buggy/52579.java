@java.lang.Override
public void run() {
    if ((mAdapter) != null) {
        mAdapter.setLoading(false);
        mAdapter.addData(getData(offset));
    }
}