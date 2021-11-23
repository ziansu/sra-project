public static uk.ac.ebi.quickgo.geneproduct.common.document.GeneProductDocument createDocWithId(java.lang.String id) {
    uk.ac.ebi.quickgo.geneproduct.common.document.GeneProductDocument doc = new uk.ac.ebi.quickgo.geneproduct.common.document.GeneProductDocument();
    doc.id = id;
    doc.type = "protein";
    doc.taxonId = 35758;
    doc.symbol = "Streptomyces ghanaensis - symbol";
    doc.parentId = "UniProtKB:OK0206";
    doc.database = "UniProt";
    doc.databaseSubsets = java.util.Arrays.asList("RRR", "QQQ");
    doc.isAnnotated = true;
    doc.isIsoform = true;
    doc.isCompleteProteome = true;
    doc.name = "moeA5";
    doc.referenceProteome = "AAAA";
    doc.synonyms = java.util.Collections.singletonList("3SSW23");
    return doc;
}