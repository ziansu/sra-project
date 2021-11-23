public void spawnBazels() {
    Bazell spawnedBazell = new Bazell(0.5F, ownedBy.getControlerIndex(), basePosition);
    if ((ownBazells.size()) <= (Basis.MAX_NUMBER_BAZELLS)) {
        ownBazells.add(spawnedBazell);
    }else {
        java.lang.System.err.println("Spawned more Bazells than allowed, this should not happen!");
    }
}