@java.lang.Override
public void onTick(net.frozenbit.plugin5zig.cubecraft.gamemodes.DuelsGameMode gameMode) {
    if ((gameMode.getState()) != (eu.the5zig.mod.server.GameState.LOBBY)) {
        (timer)++;
        if (((timer) % (net.frozenbit.plugin5zig.cubecraft.listeners.DuelsListener.OPPONENT_UPDATE_INTERVAL)) == 0) {
            updateOpponentInfo(gameMode);
        }
    }
}