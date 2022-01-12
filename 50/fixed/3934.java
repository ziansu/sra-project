@java.lang.Override
public void onGameModeJoin(net.frozenbit.plugin5zig.cubecraft.gamemodes.SkywarsMode gameMode) {
    super.onGameModeJoin(gameMode);
    gameMode.setKitsEnabled(((eu.the5zig.mod.The5zigAPI.getAPI().getItemCount("item.paper")) == 1));
    requestPlayerList();
}