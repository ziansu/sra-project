public void updateName(model.Player player) {
    java.lang.String oldName = playerLabel.getText();
    playerLabel.setText(player.getName());
    if (player.getName().equalsIgnoreCase("Disconnesso")) {
        waiting((oldName + " - Disconnesso"));
    }
}