public void b(net.minecraft.server.v1_12_R1.EnumGamemode enumgamemode) {
    if ((this.gamemode) == (EnumGamemode.NOT_SET)) {
        this.gamemode = enumgamemode;
    }
    this.setGameMode(this.gamemode);
}