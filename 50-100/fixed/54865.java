@java.lang.Override
@hugo.weaving.DebugLog
public void failure(retrofit.RetrofitError error) {
    mSignInButton.setEnabled(true);
    mRegisterButton.setEnabled(true);
    de.jhbruhn.moin.data.MoinError e = ((de.jhbruhn.moin.data.MoinError) (error.getBodyAs(de.jhbruhn.moin.data.MoinError.class)));
    if (e != null)
        mSignInButton.setErrorText(e.message);
    
    mSignInButton.setProgress((-1));
    error.printStackTrace();
}