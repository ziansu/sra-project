@java.lang.Override
public void onGetDataShareWithFinish(com.owncloud.android.lib.common.operations.RemoteOperationResult result) {
    ((com.owncloud.android.ui.activity.ShareActivity) (getActivity())).dismissLoadingDialog();
    if ((result != null) && (result.isSuccess())) {
        com.owncloud.android.lib.common.utils.Log_OC.d(com.owncloud.android.ui.fragment.ShareFileFragment.TAG, "Get Data Share With finishes sucessfully");
    }
    refreshUsersOrGroupsListFromDB();
}