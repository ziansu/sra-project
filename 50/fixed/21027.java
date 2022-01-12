@org.junit.Test
public void getKeyTest() {
    org.junit.Assert.assertNotNull(caseRecommendDao.getRandomCases().size());
}