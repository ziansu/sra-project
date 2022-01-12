public static void init() {
    try {
        abo.ABO.blockLiquidXP = new da3dsoul.scaryGen.liquidXP.BlockLiquidXP(mods.immibis.lxp.LiquidXPMod.fluid);
        abo.ABO.bucket = new da3dsoul.scaryGen.liquidXP.BucketItem();
        cpw.mods.fml.common.registry.GameRegistry.addSubstitutionAlias("LiquidXP:liquidxp.bucket", GameRegistry.Type.ITEM, ABO.bucket);
        mods.immibis.lxp.LiquidXPMod.mbPerXp = 1;
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
        abo.ABO.blockLiquidXP = null;
        abo.ABO.bucket = null;
    }
}