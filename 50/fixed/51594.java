@java.lang.Override
public boolean validateText(java.lang.String val) {
    if (super.validateText(val)) {
        if (this.subgridPanel.isValidSubGrid()) {
            return true;
        }
    }
    return false;
}