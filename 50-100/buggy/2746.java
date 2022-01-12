public void setCalculable(de.bananaco.bpermissions.api.util.CalculableType type, java.lang.String c) {
    if ((world) == null) {
        sender.sendMessage(format("Please select a loaded world!"));
        return ;
    }
    calc = world.get(c, type);
    sender.sendMessage(format(((calc.getName()) + " selected.")));
}