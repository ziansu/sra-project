private static void getBlocks() {
    magicbees.main.utils.compat.RedstoneArsenalHelper.fluxBlock = magicbees.main.utils.ItemInterface.getItemStack(magicbees.main.utils.compat.RedstoneArsenalHelper.Name.toLowerCase(), "blockElectrumFlux");
    if ((magicbees.main.utils.compat.RedstoneArsenalHelper.fluxNugget) == null) {
        throw new java.lang.RuntimeException((("Can't find " + (magicbees.main.utils.compat.RedstoneArsenalHelper.Name)) + ".blockElectrumFlux"));
    }
}