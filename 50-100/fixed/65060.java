@java.lang.Override
public void execute() {
    if (((player.getSelectedRallyPoint()) != null) && ((player.getSelectedEntity()) != null)) {
        player.setSelectedAction(player.getSelectedEntity().cycleThroughActions(actionModifier));
    }else {
        if ((player.getSelectedRallyPoint()) != null) {
            player.setSelectedAction(player.getSelectedRallyPoint().cycleThroughActions(actionModifier));
        }
    }
}