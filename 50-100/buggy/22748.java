@java.lang.Override
public void onClick(android.view.View v) {
    ((com.quickblox.q_municate.ui.mediacall.CallActivity) (getActivity())).stopIncomeCallTimer();
    switch (v.getId()) {
        case R.id.acceptCallButton :
            android.util.Log.d(com.quickblox.q_municate.ui.mediacall.IncomingCallFragment.TAG, "Accept call was clicked");
            accept();
            break;
        case R.id.denyCallButton :
            android.util.Log.d(com.quickblox.q_municate.ui.mediacall.IncomingCallFragment.TAG, "Deny call was clicked");
            reject();
            break;
        default :
            break;
    }
}