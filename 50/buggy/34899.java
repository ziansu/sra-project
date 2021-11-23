private void createDummy(int posX, int posY, boolean facingEast) {
    screens.Dummy dummy = new screens.Dummy(player, posX, posY, facingEast);
    targets.add(dummy);
}