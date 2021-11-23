@java.lang.Override
protected void onEnable() {
    this.treasures = new java.util.ArrayList<craftoplugin.modules.treasure.Treasure>();
    this.treasureMap = new craftoplugin.utility.BlockMap<craftoplugin.modules.treasure.Treasure>();
    this.loadTreasures();
    this.registerListener(new craftoplugin.modules.treasure.TreasureListener(this));
    final craftoplugin.modules.treasure.TreasureCommands commands = new craftoplugin.modules.treasure.TreasureCommands(this);
    this.registerCommands(commands);
    this.registerListener(commands);
}