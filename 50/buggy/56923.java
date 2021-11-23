@butterknife.OnClick(value = R.id.txt_accept)
public void accept(android.view.View view) {
    android.widget.Toast.makeText(getActivity(), "Congrats!", Toast.LENGTH_SHORT).show();
    com.examples.ankit.breakpoint.prefences.MyPreferenceManager.setUserConsent(true);
    if ((mListener) != null) {
        mListener.onAgreementAccepted(true);
    }
}