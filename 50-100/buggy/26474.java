public static void init() {
    abo.ABO.blockLiquidXP = new da3dsoul.scaryGen.liquidXP.BlockLiquidXP(mods.immibis.lxp.LiquidXPMod.fluid);
    abo.ABO.bucket = new da3dsoul.scaryGen.liquidXP.BucketItem();
    mods.immibis.lxp.LiquidXPMod.mbPerXp = 1;
    try {
        cpw.mods.fml.common.registry.GameRegistry.addSubstitutionAlias("LiquidXP:liquidxp.bucket", GameRegistry.Type.ITEM, ABO.bucket);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}