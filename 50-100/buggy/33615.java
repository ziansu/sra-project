@java.lang.Override
public void onTick(net.minecraftforge.fml.common.gameevent.TickEvent event) {
    if (this.entity.isDead) {
        this.repeat = false;
    }else {
        disconsented.anssrpg.common.Logging.debug(((("Attempting to apply potion " + (this.effect.getEffectName())) + " to ") + (this.entity.getName())));
        this.entity.addPotionEffect(new net.minecraft.potion.PotionEffect(this.effect));
    }
}