@java.lang.Override
public org.mskcc.cbio.oncokb.model.Gene findGeneByAlias(java.lang.String geneAlias) {
    java.util.List<org.mskcc.cbio.oncokb.model.Gene> genes = findByNamedQuery("findGenesByAlias", geneAlias);
    if ((genes.isEmpty()) || ((genes.size()) > 1)) {
        return null;
    }else {
        return genes.get(0);
    }
}