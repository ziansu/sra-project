@java.lang.Override
public boolean usable(nightgames.combat.Combat c, java.lang.Character target) {
    return (((c.getStance().reachTop(getSelf())) && (!(target.breastsAvailable()))) || (((c.getStance().oral(getSelf())) || (c.getStance().reachBottom(getSelf()))) && (!(target.crotchAvailable())))) && (getSelf().canAct());
}