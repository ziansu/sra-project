private boolean isEverythingFilled() {
    try {
        boolean isEverythingFilled = (!(orgUnitView.getSelectedItem().equals(orgUnitDefaultOption))) && (!(programView.getSelectedItem().equals(programDefaultOption)));
        return !isEverythingFilled ? false : !(tabGroupView.getSelectedItem().equals(tabGroupDefaultOption));
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return true;
    }
}