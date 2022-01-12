@java.lang.Override
public void setSpeciesProperties(magicbees.bees.IAlleleBeeSpeciesBuilder speciesBuilder) {
    speciesBuilder.addProduct(magicbees.bees.EnumBeeSpecies.getComb(EnumCombType.FURTIVE), 0.1F);
    speciesBuilder.addProduct(magicbees.bees.EnumBeeSpecies.getComb(EnumCombType.TE_ENDEARING), 0.1F);
    addRequiredOreDictSpeciality("dustPlatinum", speciesBuilder, 0.09F);
}