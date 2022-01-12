@java.lang.Override
public void applyBoon(model.entity.Entity entityToAffect) {
    model.entity.EntityEffectHandler.applyHeal(entityToAffect, ((this.heal) * (this.getEntity().getSkillValue("Boon"))));
}