public void addGroupClicked() {
    java.lang.String groupName = ui.addGroupPopUp();
    if (groupName != null) {
        if (groupName.equals("")) {
            ui.invalidGroupNamePopUp();
            addGroupClicked();
        }else {
            addGroup(groupName);
            ui.enableComponents(true);
            ui.updateListDisplay("");
        }
    }
}