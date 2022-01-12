@java.lang.Override
public java.lang.String getFactionId() {
    this.poll();
    if (((this.values.get("faction")) == null) || ((this.values.get("faction")) == "")) {
        this.setFaction("0");
    }
    return this.values.get("faction");
}