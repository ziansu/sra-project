private mc.euro.demolition.BombPlugin updateConfig() {
    getConfig().set("BaseBlock", this.BaseBlock.name());
    getConfig().set("BombBlock", this.BombBlock.name());
    getConfig().set("DatabaseTable", this.DatabaseTable);
    return this;
}