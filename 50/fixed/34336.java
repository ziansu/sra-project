@java.lang.Override
public void onSuccess(com.igorko.accesibleif.models.Data response) {
    if (mIsActivityVisible) {
        onResponseSuccess(response);
    }
}