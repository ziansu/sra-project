@org.junit.Before
public void setup() {
    geneProductDocConverter = new uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImpl();
    geneProductDocument = new uk.ac.ebi.quickgo.geneproduct.common.document.GeneProductDocument();
    geneProductDocument.id = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.ID;
    geneProductDocument.database = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.DATABASE;
    geneProductDocument.databaseSubsets = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.DATABASE_SUBSETS;
    geneProductDocument.isAnnotated = true;
    geneProductDocument.synonyms = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.SYNONYMS;
    geneProductDocument.isIsoform = true;
    geneProductDocument.name = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.NAME;
    geneProductDocument.referenceProteome = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.REF_PROTEOME;
    geneProductDocument.isCompleteProteome = true;
    geneProductDocument.parentId = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.PARENT_ID;
    geneProductDocument.symbol = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.SYMBOL;
    geneProductDocument.taxonId = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.TAX_ID;
    geneProductDocument.type = uk.ac.ebi.quickgo.geneproduct.service.converter.GeneProductDocConverterImplTest.TYPE;
}