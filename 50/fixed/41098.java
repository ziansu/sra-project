@java.lang.Override
public void onLeaderChosen(int kpuId) {
    Client.killCivilianVote(kpuId);
}