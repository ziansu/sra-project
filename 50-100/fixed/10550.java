private boolean validateQuantity() {
    int quantity = java.lang.Integer.valueOf(subgroupsQuantity.getText().toString());
    if (quantity > (getMaximumQuantity())) {
        subgroupsQuantityLayout.setError(getString(R.string.nwinners_msg_validate_quantity, getMaximumQuantity()));
        requestFocus(subgroupsQuantity);
        return false;
    }
    return true;
}