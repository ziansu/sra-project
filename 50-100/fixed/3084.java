@java.lang.Override
protected void onResume() {
    super.onResume();
    refreshList();
    if ((((com.s7design.menu.utils.Settings.getAccessToken(this)) != null) && (!(com.s7design.menu.utils.Settings.getAccessToken(this).isEmpty()))) && (com.s7design.menu.activities.CheckoutActivity.isCheckoutCLicked)) {
        showProgressDialogLoading();
        checkout();
    }else {
        com.s7design.menu.activities.CheckoutActivity.isCheckoutCLicked = false;
    }
}