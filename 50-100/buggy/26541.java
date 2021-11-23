@java.lang.Override
public java.lang.String getFactionId() {
    this.poll();
    if (((this.values.get("faction")) == null) || ((this.values.get("faction")) == "")) {
        this.setFaction(net.redstoneore.legacyfactions.entity.FactionColl.get().getWilderness());
    }
    return this.values.get("faction");
}