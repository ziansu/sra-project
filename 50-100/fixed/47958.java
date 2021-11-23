private void startFight(int kopfoderzahl) {
    pkg.Charakter c1 = this.player1.getCharakter();
    pkg.Charakter c2 = this.player2.getCharakter();
    for (; this.checkCondition(c1, c2); ++kopfoderzahl) {
        pkg.Charakter aktiveplayer = this.getAktiveCharakter(kopfoderzahl, c1, c2);
        this.attackingMenu(this.attackingOption(aktiveplayer), aktiveplayer);
    }
}