@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    poseidon.entities.LevelContainer selected = view.getSelectedLevel();
    if (selected == null) {
        return ;
    }
    selected.getLevel().setIsAddedToPlayer(true);
    poseidon.entities.XMLHandler.saveXML(selected.getLevel(), selected.getLevelFileName());
    view.setSelectedLevel(null);
    view.disableButtons();
    view.modelUpdated();
}