private void init() {
    if ((speciesBuilder) == null) {
        return ;
    }
    if (isSecret()) {
        speciesBuilder.setIsSecret();
    }
    setSpeciesProperties(speciesBuilder);
    species = speciesBuilder.build();
    template = branch.getTemplate();
    binnie.genetics.genetics.AlleleHelper.getInstance().set(template, EnumBeeChromosome.SPECIES, species);
    setAlleles(template);
    genome = BeeManager.beeRoot.templateAsGenome(template);
    BeeManager.beeRoot.registerTemplate(template);
}