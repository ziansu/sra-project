@java.lang.Override
public void setGoalTarget(net.minecraft.server.v1_9_R1.EntityLiving entityliving, org.bukkit.event.entity.EntityTargetEvent.TargetReason reason, boolean fireEvent) {
    if (((this.target) instanceof net.minecraft.server.v1_9_R1.EntityLiving) && (this.target.isAlive())) {
        super.setGoalTarget(this.target, EntityTargetEvent.TargetReason.CUSTOM, false);
    }else {
        super.setGoalTarget(null, EntityTargetEvent.TargetReason.CUSTOM, false);
    }
}