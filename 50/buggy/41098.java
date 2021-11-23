@java.lang.Override
public void onLeaderChosen(int kpuId) {
    if (kpuId != (Client.playerID)) {
        Client.killCivilianVote(kpuId);
    }
}