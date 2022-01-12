@org.junit.Test
public void CompareTest() {
    java.util.Random rand = new java.util.Random();
    tests.AbstractDaoFactory daoFact = new tests.DaoFactory();
    tests.CompareDao dao = daoFact.getCompareDao();
    for (int i = 0; i < 50; i++) {
        assertTrue(dao.playerComparison((((rand.nextFloat()) * ((max) - (min))) + (min)), "RB", "New York Jets", 1));
    }
}