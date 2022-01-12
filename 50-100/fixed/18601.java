@java.lang.Override
public void onEnable() {
    this.load();
    mysql = new de.fly4lol.autowgk.util.MySQLMethods(this);
    this.framework = new de.pro_crafting.commandframework.CommandFramework(this);
    commands = new de.fly4lol.autowgk.Commands(this, sql);
    this.framework.registerCommands(commands);
    this.framework.registerHelp();
    wg = de.pro_crafting.wg.WarGear.getPlugin(de.pro_crafting.wg.WarGear.class);
    this.registerListener();
}