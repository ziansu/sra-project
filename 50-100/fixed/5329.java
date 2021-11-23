@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.qadmni.fragments.BaseFragment.mSessionManager = com.qadmni.utils.SessionManager.getInstance(getActivity().getApplicationContext());
    context = getContext();
    mServerSyncManager = new com.qadmni.utils.ServerSyncManager(getActivity().getApplicationContext(), com.qadmni.fragments.BaseFragment.mSessionManager);
    qadmniHelper = new com.qadmni.database.QadmniHelper(getActivity(), com.qadmni.fragments.BaseFragment.mSessionManager);
    qadmniHelper.getDatabaseStructure();
    progressDialog = com.qadmni.utils.DialogUtils.getProgressDialog(getContext());
    progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
}