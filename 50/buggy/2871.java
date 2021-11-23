@java.lang.Override
public boolean receiveClientEvent(int par1, int par2) {
    if (par1 == 1) {
        this.numPlayersUsing = par2;
        this.checkForAdjacentChests();
    }
    return true;
}