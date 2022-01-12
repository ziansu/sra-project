@java.lang.Override
protected void reset(float pos1, float pos2) {
    squadSelectButton = mainButton.addSelectButton(this);
    super.reset(pos1, pos2);
    inventory.reset();
    this.setSelected(true);
    selectKey = com.esbjon.entities.Squad.handler.findOrAssignKey(this);
    this.stop();
}