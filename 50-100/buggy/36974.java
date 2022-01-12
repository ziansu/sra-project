protected void reset(float pos1, float pos2) {
    this.setSelected(true);
    super.reset(pos1, pos2);
    inventory.reset();
    squadSelectButton = mainButton.addSelectButton(this);
    selectKey = com.esbjon.entities.Squad.handler.findOrAssignKey(this);
}