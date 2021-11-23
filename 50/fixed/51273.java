public void onPlayerWin() {
    main.Print.printDefeated(player, monster);
    player.onKillMonster(monster);
}