@org.junit.jupiter.api.BeforeEach
void setUp() {
    java.lang.String[] rules = new java.lang.String[]{ "0/9/1/0" , "1/9/1/2" , "2/9/1/3" , "1/12/1/3" };
    tgm = new TableGenerationMaker();
    tgm.setRules(rules);
    tgm.setNeighbourhood("Moore");
    tgm.setBoundary("Void");
}