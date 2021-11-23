public void setStatuses() {
    for (client.MapleCharacter chr : getParty()) {
        chr.setPQ(this);
    }
}