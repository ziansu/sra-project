@java.lang.Override
public void start(seventh.ai.basic.Brain brain) {
    java.util.List<seventh.ai.basic.AttackDirection> attackDirs = brain.getWorld().getAttackDirections(brain.getEntityOwner());
    this.getActionResult().setSuccess(attackDirs);
}