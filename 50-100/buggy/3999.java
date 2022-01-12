public org.openlmis.referencedata.domain.ProgramProduct createProgramProduct(org.openlmis.referencedata.domain.OrderableProduct product) {
    java.util.Objects.requireNonNull(programRepository, ("Program Repository needed to be injected prior to " + "creating program product"));
    java.util.Objects.requireNonNull(product, "Product can't be null when building a program product");
    org.openlmis.referencedata.domain.Program storedProgram = programRepository.findOne(programId);
    return org.openlmis.referencedata.domain.ProgramProduct.createNew(storedProgram, productCategory, product, dosesPerMonth, active, fullSupply, displayOrder, maxMonthsOfStock);
}