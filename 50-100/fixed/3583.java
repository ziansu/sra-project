public void testDeadGhostUsingGun() {
    shared.logic.Player gs = addPlayer(shared.logic.templates.BasicRoles.Gunsmith());
    shared.logic.Player ghost = addPlayer(shared.logic.templates.BasicRoles.Ghost());
    shared.logic.Player sk = addPlayer(shared.logic.templates.BasicRoles.SerialKiller());
    shared.logic.Player maf = addPlayer(shared.logic.templates.BasicRoles.Mafioso());
    setTarget(gs, ghost);
    endNight();
    lynch(ghost, gs, sk, maf);
    try {
        shoot(ghost, maf);
        fail();
    } catch (shared.logic.exceptions.PlayerTargetingException e) {
    }
}