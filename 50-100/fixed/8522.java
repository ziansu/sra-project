@java.lang.Override
public void setDead() {
    net.minecraft.entity.player.EntityPlayer caster = this.getThrower();
    if (caster != null) {
        caster.dismountRidingEntity();
        com.teaminfinity.elementalinvocations.handler.PlayerStateHandler.getInstance().getState(caster).setInvisible(false).setInvulnerable(false).setEthereal(false);
    }
    super.setDead();
}