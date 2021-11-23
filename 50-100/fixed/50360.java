public void previousPage() {
    if (!(Proxies.common.isSimulating(player.worldObj))) {
        sendSelection(false);
        return ;
    }
    if ((stations.size()) == 0) {
        return ;
    }
    stationIndex = (((stationIndex) - 1) + (stations.size())) % (stations.size());
    updateTradeInfo();
}