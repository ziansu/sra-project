public static boolean combine(int itemOne, int itemTwo) {
    org.rev317.min.api.wrappers.Item io = org.rev317.min.api.methods.Inventory.getItem(itemOne);
    org.rev317.min.api.wrappers.Item it = org.rev317.min.api.methods.Inventory.getItem(itemTwo);
    if (io != null) {
        if (it != null) {
            org.rev317.min.api.methods.Menu.interact(io, Items.Option.USE.getActionId());
            org.parabot.environment.api.utils.Time.sleep(50, 100);
            org.rev317.min.api.methods.Menu.interact(it, Items.Option.USE_WITH.getActionId());
            org.parabot.environment.api.utils.Time.sleep(50, 100);
            return true;
        }
    }
    return false;
}