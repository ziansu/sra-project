public void nextPage() {
    if (!(Proxies.common.isSimulating(player.worldObj))) {
        sendSelection(true);
        return ;
    }
    if ((stations.size()) == 0) {
        return ;
    }
    stationIndex = ((stationIndex) + 1) % (stations.size());
    updateTradeInfo();
}