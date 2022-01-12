@java.lang.Override
public void execute() {
    if ((player.getSelectedRallyPoint()) != null) {
        player.setSelectedAction(player.getSelectedEntity().cycleThroughActions(actionModifier));
    }else {
        player.setSelectedAction(player.getSelectedRallyPoint().cycleThroughActions(actionModifier));
    }
}