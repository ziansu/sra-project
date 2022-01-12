@butterknife.OnClick(value = R.id.btn_review_transfer)
void reviewTransfer() {
    if ((etAmount.getText().toString().equals(".")) | (etAmount.getText().toString().equals("0"))) {
        showToaster(getString(R.string.enter_amount));
        return ;
    }
    if (spPayTo.getSelectedItem().toString().equals(spPayFrom.getSelectedItem().toString())) {
        showToaster(getString(R.string.error_same_account_transfer));
        return ;
    }
    validator.validate(true);
}