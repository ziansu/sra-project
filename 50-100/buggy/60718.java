public de.bib.pbg2h15a.Bomb dropBomb() {
    de.bib.pbg2h15a.Bomb bombe = new de.bib.pbg2h15a.Bomb(this, pos, this.bombRadius, stage.getFields());
    de.bib.pbg2h15a.Player player = new de.bib.pbg2h15a.Player("", new java.awt.Point(), null);
    bombe.setPos(player.getPos());
    return bombe;
}