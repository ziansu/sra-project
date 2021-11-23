private boolean isEverythingFilled() {
    try {
        boolean isEverythingFilled = (!(orgUnitView.getSelectedItem().equals(orgUnitDefaultOption))) && (!(programView.getSelectedItem().equals(programDefaultOption)));
        if (tabGroupView.getSelectedItem().equals(tabGroupDefaultOption))
            isEverythingFilled = false;
        
        return isEverythingFilled;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return true;
    }
}