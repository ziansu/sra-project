public void endGame() {
    this.counter = (this.startTime) + 1;
    this.setGameStatus(GameStatus.WAITING);
    this.sendMessage("Game ending!");
    java.lang.System.out.println(this.getPlayers().size());
    java.lang.System.out.println(this.players.size());
    for (org.bukkit.entity.Player p : this.getPlayers()) {
        this.quitGame(p);
        java.lang.System.out.println(p.getName());
    }
}