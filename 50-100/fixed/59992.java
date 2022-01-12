@java.lang.Override
public void run() {
    if (player.getVelocity().equals(new org.bukkit.util.Vector(0, 0, 0))) {
        for (org.bukkit.entity.Player pla : DynamicAC.instance.onlinestaff) {
            pla.sendMessage((((org.dynamicmc.dynamicac.DynamicAC.prefix) + (damager.getName())) + " failed AntiKB!"));
        }
    }
}