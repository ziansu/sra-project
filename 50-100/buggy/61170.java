@java.lang.Override
public void addMonster(int[] number) {
    int[] count = number;
    if (currentPlayer.equals(p1)) {
        p1.addMonster(count);
        notifyObservers();
        callMonsterChoice();
        gameStat = "monP2";
        changePlayer();
    }else {
        p2.addMonster(count);
        startBattle();
    }
}