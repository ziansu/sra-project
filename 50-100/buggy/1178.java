public boolean checkEmptyBoxes() {
    if ((((vnametxt.getText().equals("")) || (vnumbertxt.getText().equals(""))) || (vtypebox.getSelectedItem().equals("Select vehicle type"))) || ((vtypebox.getSelectedItem()) == null)) {
        return false;
    }else {
        return true;
    }
}