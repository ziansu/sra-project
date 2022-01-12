private void CreateSpecies(java.lang.String type, int number) {
    for (int i = 0; i < number; i++) {
        GetPositionsAndTypes();
        ((java.util.List<Species.ISpecie>) (species)).add(Species.SpecieFactory.GetSpecies(type, RandomPosition()));
    }
}