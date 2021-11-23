public void changed() {
    if (((txtStaff.getText().equals("")) || (txtCustomer.getText().equals(""))) || (txtPrice.getText().equals(""))) {
        btnAdd.setEnabled(false);
    }else {
        btnAdd.setEnabled(true);
    }
}