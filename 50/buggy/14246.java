@java.lang.Override
public double getTotalWeight() {
    double d = 0;
    for (info.faceland.loot.api.sockets.SocketGem sg : getSocketGems()) {
        d += sg.getWeight();
    }
    return d;
}