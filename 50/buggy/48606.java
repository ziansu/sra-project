@java.lang.Override
public void onError(@co.infinum.princeofversions.common.ErrorCode
int error) {
    toastIt(java.lang.String.format(getString(R.string.update_error), java.lang.String.valueOf(error)), Toast.LENGTH_SHORT);
}