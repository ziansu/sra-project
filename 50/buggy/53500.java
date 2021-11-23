public void onPlayerWin() {
    currentStage.onMonsterKilled();
    main.Print.printDefeated(player, monster);
    player.onKillMonster(monster);
}