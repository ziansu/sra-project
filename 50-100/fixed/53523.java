public void transformation() {
    net.minecraft.inventory.IInventory[] inputs = hok.chompzki.biocristals.api.BioHelper.getInventories(this, hok.chompzki.biocristals.tile_enteties.TileReagentPurifier.inputSides);
    net.minecraft.inventory.IInventory output = ((net.minecraft.inventory.IInventory) (hok.chompzki.biocristals.api.BioHelper.getTileEntityOnSide(this, hok.chompzki.biocristals.tile_enteties.TileReagentPurifier.outputSide)));
    hok.chompzki.biocristals.recipes.RecipePurifier recp = hok.chompzki.biocristals.registrys.RecipeRegistry.getRecipePurifier(inputs);
    if (recp == null)
        return ;
    
    net.minecraft.item.ItemStack result = recp.result();
    recp.pay(inputs);
    hok.chompzki.biocristals.api.BioHelper.addItemStackToInventory(result, output);
}