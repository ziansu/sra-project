public void groupModeOn(com.svenskfiskapps.materialtodo.TaskGroup g) {
    com.svenskfiskapps.materialtodo.MainActivity.groupIsSelected = true;
    com.svenskfiskapps.materialtodo.MainActivity.currentGroup = g;
    editGroup.setVisible((!(g.equals(com.svenskfiskapps.materialtodo.MainActivity.defaultGroup))));
}