public static kingofthehill.unitinfo.UnitInfo getMeleeUnit(kingofthehill.domain.IPlayer owner) {
    final int HP = 100;
    final int ATK = 10;
    final int AMR = 5;
    final int SPD = 1;
    final int COST = 5;
    kingofthehill.domain.Unit mel = new kingofthehill.domain.Melee(HP, ATK, AMR, SPD, owner);
    return new kingofthehill.unitinfo.UnitInfo(COST, mel);
}