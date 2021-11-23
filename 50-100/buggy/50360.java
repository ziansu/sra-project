public void previousPage() {
    if (!(Proxies.common.isSimulating(player.worldObj))) {
        sendSelection(false);
        return ;
    }
    stationIndex = (((stationIndex) - 1) + (stations.size())) % (stations.size());
    updateTradeInfo();
}