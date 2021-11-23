private void initializeModel() throws java.io.IOException {
    java.util.List<edu.mtu.parser.ChemicalDto> chemicals = edu.mtu.parser.Parser.parseChemicals(properties.getChemicalsFileName());
    edu.mtu.catalog.ReactionRegistry registry = edu.mtu.catalog.ReactionRegistry.getInstance();
    edu.mtu.Reactor.Reactor reactor = edu.mtu.Reactor.Reactor.getInstance();
    for (edu.mtu.parser.ChemicalDto chemical : chemicals) {
        edu.mtu.compound.Species species = registry.getSpecies(chemical.formula);
        int quantity = ((int) ((chemical.mols) * (properties.getMoleculesPerMole())));
        reactor.createEntities(species, quantity);
    }
}