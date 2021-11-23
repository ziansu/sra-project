@java.lang.Override
public void setSpeciesProperties(magicbees.bees.IAlleleBeeSpeciesBuilder speciesBuilder) {
    speciesBuilder.setHasEffect();
    speciesBuilder.addProduct(magicbees.bees.EnumBeeSpecies.getForestryComb(EnumHoneyComb.MYSTERIOUS), 0.1F);
    speciesBuilder.addProduct(magicbees.bees.EnumBeeSpecies.getComb(EnumCombType.TE_ENDEARING), 0.05F);
    speciesBuilder.addSpecialty(new net.minecraft.item.ItemStack(net.minecraft.init.Items.ENDER_PEARL), 0.05F);
    addRequiredOreDictSpeciality("nuggetEnderium", speciesBuilder, 0.09F);
}