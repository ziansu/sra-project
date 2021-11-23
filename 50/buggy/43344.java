@java.lang.Override
public void run() {
    java.lang.String playerName = com.Acrobot.Breeze.Utils.NameUtil.stripUsername(playerDTO.getName());
    java.util.UUID uuid = com.Acrobot.ChestShop.UUIDs.NameManager.getUUID(playerName);
    com.Acrobot.ChestShop.UUIDs.NameManager.storeUsername(playerDTO);
}