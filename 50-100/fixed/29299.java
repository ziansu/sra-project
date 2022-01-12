private void showCreatedView() {
    tvWelcome.setVisibility(View.GONE);
    chkTermsOfUse.setVisibility(View.GONE);
    tilUserName.setVisibility(View.GONE);
    btnCreateAccount.setVisibility(View.GONE);
    tvInfo.setText(getString(R.string.activity_create_account_account_created));
    tvInfo.setVisibility(View.VISIBLE);
    pgrCreateAccount.setVisibility(View.VISIBLE);
}