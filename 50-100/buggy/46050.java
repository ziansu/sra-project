public void nextPage() {
    if (!(Proxies.common.isSimulating(player.worldObj))) {
        sendSelection(true);
        return ;
    }
    stationIndex = ((stationIndex) + 1) % (stations.size());
    updateTradeInfo();
}