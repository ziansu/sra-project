@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.example.admin.loadingzone.modules.home.PostedJobDetailsActivity.REQUEST_CODE)) {
        mSheetLayout.contractFab();
    }
    if (requestCode == 2) {
        java.lang.String isUpdated = data.getStringExtra("isUpdated");
        if (isUpdated != null)
            if (isUpdated.equals("True")) {
                getLoadingJobDeatails(JobId);
            }
        
    }
}