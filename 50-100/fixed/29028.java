@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {
        if ((getContext()) != null) {
            if ((this.progressDialog) == null) {
                this.progressDialog = com.stgobain.samuha.utility.AppUtils.createProgressDialog(getActivity());
                this.progressDialog.show();
            }else {
                this.progressDialog.show();
            }
            requestTeam();
        }
    }
}