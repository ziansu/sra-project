public boolean validation() {
    if ((txt.getText().toString()) == "") {
        printMsg("Name is required");
        return false;
    }
    return true;
}