public void changeStance(kru.codefight.fighter.Stance stance) {
    boolean interrupted = resolveStun();
    if (!interrupted) {
        fighter.setStance(stance);
    }
}