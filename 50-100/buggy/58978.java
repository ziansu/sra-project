@java.lang.Override
public org.mskcc.cbio.oncokb.model.Gene findGeneByAlias(java.lang.String geneAlias) {
    java.lang.String[] params = new java.lang.String[]{ "geneAlias" };
    java.lang.String[] values = new java.lang.String[]{ geneAlias };
    java.util.List<org.mskcc.cbio.oncokb.model.Gene> genes = findByNamedQuery("findGenesByAlias", params, values);
    if ((genes.isEmpty()) || ((genes.size()) > 1)) {
        return null;
    }else {
        return genes.get(0);
    }
}