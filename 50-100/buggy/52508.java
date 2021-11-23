public static void attachAttackStatus(com.toyknight.aeii.utils.Unit attacker, com.toyknight.aeii.utils.Unit defender) {
    if (attacker.hasAbility(Ability.POISONER)) {
        defender.attachStatus(new com.toyknight.aeii.utils.Status(Status.POISONED, 1));
        return ;
    }
    if ((attacker.hasAbility(Ability.SLOWING_GAZE)) && (!(defender.hasAbility(Ability.SLOWING_GAZE)))) {
        defender.attachStatus(new com.toyknight.aeii.utils.Status(Status.PETRIFACTED, 0));
        defender.setCurrentMovementPoint(defender.getMovementPoint());
    }
}