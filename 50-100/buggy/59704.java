public static FightGame.Player fight(FightGame.Player a, FightGame.Player b) {
    while (true) {
        b.setBloodValue(((b.getBloodValue()) - (a.getAtk())));
        if (FightGame.GameMain.isDead(a)) {
            return a;
        }
        a.setBloodValue(((a.getBloodValue()) - (b.getAtk())));
        if (FightGame.GameMain.isDead(b)) {
            return b;
        }
    } 
}