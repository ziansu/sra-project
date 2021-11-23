private void runPlayer(rproject.engine.Player player) {
    rproject.io.Output.write("***** ");
    rproject.io.Output.write(player.getName());
    rproject.io.Output.writeln(" ******");
    fire();
    currentPlayer = player;
    currentPhase = "Spawn Phase";
    spawnPhase(player);
    currentPhase = "Attack Phase";
    boolean getBonus = attackPhase(player);
    if ((numberOfPlayers()) == 1)
        return ;
    
    currentPhase = "Move Phase";
    movePhase(player);
    if (getBonus)
        bonusPhase(player);
    
}