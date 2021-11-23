private boolean tryPlayCardInternal(int player, @org.jetbrains.annotations.NotNull
su.iota.backend.game.impl.Coordinate coordinate, @org.jetbrains.annotations.NotNull
su.iota.backend.game.impl.FieldItem card, boolean isEphemeral) throws co.paralleluniverse.fibers.SuspendExecution {
    boolean isOk = true;
    isOk = isOk && (coordinate.isInRange());
    isOk = isOk && (canPlayCard(player, card));
    isOk = isOk && (field.isPlacementCorrect(coordinate, card));
    if (!isEphemeral) {
        passAllowed = false;
        playCardInternal(player, coordinate, card);
        updateGameStateUuid();
    }
    return isOk;
}