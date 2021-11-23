public static void addChromosomeFilter(java.util.List<org.bson.conversions.Bson> chrFilters, java.lang.String chromosome) {
    if ((chromosome == null) || (chromosome.isEmpty())) {
        return ;
    }
    chromosome = org.opencb.opencga.storage.mongodb.variant.converters.VariantStringIdComplexTypeConverter.convertChromosome(chromosome);
    chrFilters.add(and(gte("_id", (chromosome + (org.opencb.opencga.storage.mongodb.variant.converters.VariantStringIdComplexTypeConverter.SEPARATOR_CHAR))), lt("_id", (chromosome + ((char) ((org.opencb.opencga.storage.mongodb.variant.converters.VariantStringIdComplexTypeConverter.SEPARATOR_CHAR) + 1))))));
}