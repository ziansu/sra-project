private void validateGeneticProfile(java.lang.String geneticProfileId) throws org.cbioportal.service.exception.GeneticProfileNotFoundException {
    org.cbioportal.model.GeneticProfile geneticProfile = geneticProfileService.getGeneticProfile(geneticProfileId);
    if ((((geneticProfile.getGeneticAlterationType().equals(GeneticAlterationType.COPY_NUMBER_ALTERATION)) && (geneticProfile.getDatatype().equals("DISCRETE"))) || (geneticProfile.getGeneticAlterationType().equals(GeneticAlterationType.MUTATION_EXTENDED))) || (geneticProfile.getGeneticAlterationType().equals(GeneticAlterationType.FUSION))) {
        throw new org.cbioportal.service.exception.GeneticProfileNotFoundException(geneticProfileId);
    }
}