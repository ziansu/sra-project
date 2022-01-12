@java.lang.Override
public void onResumeWithError(com.thecn.app.activities.profile.ProfileHomeFragment object) {
    imgGroup.setVisibility(View.GONE);
    java.lang.String error = com.thecn.app.stores.StoreUtil.getFirstResponseError(response);
    if (error == null)
        error = com.thecn.app.activities.profile.ProfileHeaderController.UserListCallback.DEFAULT_ERROR_MSG;
    
    moreView.setVisibility(View.GONE);
    if ((errorView) != null) {
        errorView.setText(error);
        errorView.setVisibility(View.VISIBLE);
    }
    sectionView.setOnClickListener(null);
}