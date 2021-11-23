@java.lang.Override
public void onSuccess(com.igorko.accesibleif.models.Data response, int type) {
    if (mIsActivityVisible) {
        onResponseSuccess(response, type);
    }
}