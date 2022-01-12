@org.junit.After
public void tearDown() {
    test.CycMapperTest.wmi_.clearCachedArticles();
    cyc.OntologyConcept.parsingArgs_ = false;
}