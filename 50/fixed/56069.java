private void doRemoveNetwork(cn.academy.energy.internal.WirelessNet net) {
    netList.remove(net);
    net.onCleanup(this);
}