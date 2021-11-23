@java.lang.Override
public void run() {
    ((org.bukkit.entity.LivingEntity) (t)).teleport(e.getLocation());
    ((org.bukkit.entity.LivingEntity) (t)).removePotionEffect(PotionEffectType.SLOW);
    ((org.bukkit.entity.LivingEntity) (t)).removePotionEffect(PotionEffectType.INVISIBILITY);
    ((org.bukkit.entity.LivingEntity) (t)).setNoDamageTicks(0);
    this.e.remove();
    this.e = null;
    this.t = null;
}