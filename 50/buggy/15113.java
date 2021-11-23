private void setNetworkValues() {
    orb.p.network.temp.TempNetworkStarter.characterName = playerName.getText();
    orb.p.network.temp.TempNetworkStarter.host = ip.getText();
    orb.p.network.temp.TempNetworkStarter.isLocal = local.getHighlight();
}