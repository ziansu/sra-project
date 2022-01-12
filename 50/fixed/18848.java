private void showAddStaff() {
    if (addStaff()) {
        com.example.framgia.hrm_10.model.utility.Utility.showToast(getApplicationContext(), getText(R.string.addSuccessfully));
        onBackPressed();
    }
}