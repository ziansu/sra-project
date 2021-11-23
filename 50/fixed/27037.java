public void setPeer(Sim.SimEnt peer) {
    if ((peer instanceof Sim.Link) && ((this._peer) == null)) {
        this._peer = peer;
        ((Sim.Link) (_peer)).setConnector(this);
    }
}