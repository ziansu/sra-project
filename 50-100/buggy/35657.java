@org.bukkit.event.EventHandler
public void onAttack(org.bukkit.event.entity.EntityDamageByEntityEvent e) {
    if ((e.getDamager()) instanceof org.bukkit.entity.Player) {
        org.bukkit.entity.Player p = ((org.bukkit.entity.Player) (e.getDamager()));
        if ((net.bubuxi.mc.binding.Binding.isBinded(p.getItemInHand())) && (net.bubuxi.mc.binding.Binding.getBinder(p.getItemInHand()).equals(p.getName()))) {
            e.setDamage(((e.getDamage()) + 3));
        }
    }
}