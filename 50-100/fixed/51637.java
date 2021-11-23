private void melting() {
    if ((burning) > 0) {
        burning = 0;
        (tickMelting)++;
        if (((tickMelting) % ((this.properties[com.nik7.upgcraft.tileentities.UpgCtileentityFluidInfuser.TICK_FOR_MELT]) / (this.properties[com.nik7.upgcraft.tileentities.UpgCtileentityFluidInfuser.NUMBER_TO_MELT]))) == 0) {
            this.moveItem(com.nik7.upgcraft.tileentities.UpgCtileentityFluidInfuser.MELT, com.nik7.upgcraft.tileentities.UpgCtileentityFluidInfuser.MELT_P);
            (this.properties[com.nik7.upgcraft.tileentities.UpgCtileentityFluidInfuser.NUMBER_TO_MELT])--;
            burning = 0;
        }
    }
}