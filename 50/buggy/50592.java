@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    com.owncloud.android.lib.common.utils.Log_OC.d(com.owncloud.android.ui.fragment.EditShareFragment.TAG, "onActivityCreated");
    getActivity().setTitle(mShare.getSharedWithDisplayName());
}