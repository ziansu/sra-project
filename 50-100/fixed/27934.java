@org.junit.Test
public void testAddTestDescription() throws java.lang.Exception {
    ua.dp.skillsup.tests.dao.entity.TestDescription testDescription3 = new ua.dp.skillsup.tests.dao.entity.TestDescription();
    testDescription3.setTestName("Java-2");
    testDescription3.setMaxTimeToPassInMinutes(90);
    dao.addTestDescription(testDescription3);
    ua.dp.skillsup.tests.dao.entity.TestDescription testDescription3Actual = dao.getTestDescription(3L);
    assertNotNull("expected save to work", testDescription3Actual);
}