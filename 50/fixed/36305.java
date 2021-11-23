public void levelUp() {
    java.lang.System.out.println("Congratulations to the survivors, you have defeated the Monster!");
    for (battlemen.Fighter player : battlemen.Battle.players) {
        player.newMaxFighterHealth();
    }
    java.lang.System.out.println("But what horrors await you in the days to come...?");
}