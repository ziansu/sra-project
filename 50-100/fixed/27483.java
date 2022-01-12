public boolean moveUnits(int nrOfAttackingUnits, java.awt.Point init, java.awt.Point dest, tora.train.risk.Player player) {
    if (!(tora.train.risk.ArenaCommandValidator.validateMove(arena, nrOfAttackingUnits, init, dest, player))) {
        return false;
    }
    if (!(arena.getTerritoryAtCoordinate(dest).getOwner().equals(player))) {
        resolveAttack(nrOfAttackingUnits, init, dest, player);
    }else {
        transferUnits(nrOfAttackingUnits, init, dest, player);
    }
    return true;
}