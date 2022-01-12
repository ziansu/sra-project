public void setBattle(battle.Battle battle, boolean seenWild) {
    this.setState(VisualState.BATTLE);
    gui.view.map.VisualState.setBattle(battle, seenWild, this.currentArea.getWeather(), this.getBattleTerrain());
}