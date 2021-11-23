private int getNumberOfExperiments(ae3.model.AtlasGene gene, @javax.annotation.Nonnull
uk.ac.ebi.gxa.web.controller.Attribute attr) {
    if (((attr.getValue()) != null) && (attr instanceof uk.ac.ebi.gxa.web.controller.EfvAttribute)) {
        return gene.getNumberOfExperiments(((uk.ac.ebi.gxa.web.controller.EfvAttribute) (attr)), atlasStatisticsQueryService);
    }
    return getRankedGeneExperiments(gene, attr, (-1), (-1)).size();
}