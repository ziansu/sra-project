@butterknife.OnClick(value = R.id.txt_accept)
public void accept(android.view.View view) {
    com.examples.ankit.breakpoint.prefences.MyPreferenceManager.setUserConsent(true);
    if ((mListener) != null) {
        mListener.onAgreementAccepted(true);
    }
}