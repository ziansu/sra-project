@net.devintia.commons.bukkit.command.CommandInfo(name = "loadmodel", perm = "loadmodel", description = "Loads and spawns a armor stand model", usage = "<command> <filenname>")
public void loadModel(net.devintia.commons.bukkit.command.CommandArguments args) {
    java.io.File file = new java.io.File(getDataFolder(), ((args.getArg(0)) + ".model"));
    if (!(file.exists())) {
        args.getSender().sendMessage("unknown model");
        return ;
    }
    net.devintia.commons.bukkit.armorstand.ArmorStandModel model = net.devintia.commons.bukkit.armorstand.ArmorStandModelImporter.importModel(args.getArg(0), file, this);
    model.spawn(args.getPlayer().getLocation());
}