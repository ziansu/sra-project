@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    mSignInButton.setEnabled(true);
    mRegisterButton.setEnabled(true);
    de.jhbruhn.moin.data.MoinError e = ((de.jhbruhn.moin.data.MoinError) (error.getBodyAs(de.jhbruhn.moin.data.MoinError.class)));
    if (e != null) {
        mRegisterButton.setErrorText(e.message);
    }
    error.printStackTrace();
    mRegisterButton.setProgress((-1));
}