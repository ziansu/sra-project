public double getFortuneModifier() {
    if (((inventory[22]) == null) || ((ExAstris.Data.ModData.sieveFortuneChance) == 0)) {
        return 0;
    }else {
        return (6.0 / 64) * (inventory[22].stackSize);
    }
}