public void testApp() {
    LearningJenkins.ProjectX.Learning obj = new LearningJenkins.ProjectX.Learning();
    int res = obj.add(200, 400);
    org.junit.Assert.assertEquals(600, res);
    res = obj.add(20, 40);
    org.junit.Assert.assertEquals(60, res);
    java.lang.String res1 = obj.concatenation("Hello ", "World!");
    org.junit.Assert.assertEquals("Hello World!", res1);
}