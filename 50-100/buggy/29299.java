private void showCreatedView() {
    tvWelcome.setVisibility(View.GONE);
    chkTermsOfUse.setVisibility(View.GONE);
    tilUserName.setVisibility(View.GONE);
    pgrCreateAccount.setVisibility(View.GONE);
    btnCreateAccount.setVisibility(View.GONE);
    btnStart.setVisibility(View.VISIBLE);
    tvInfo.setText(getString(R.string.activity_create_account_account_created));
    tvInfo.setVisibility(View.VISIBLE);
}