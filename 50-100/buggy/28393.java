private static void test(java.lang.String jsonDir, java.lang.String jsonFileName, java.lang.String expectedOutputDir, java.lang.String binDir) {
    java.lang.String jsonFile = jsonDir + jsonFileName;
    java.lang.String expectedOutput = (expectedOutputDir + (java.io.File.separator)) + (org.toradocu.util.GoalFileConverterTest.getGoalFileName(jsonFile));
    java.lang.String[] args = new java.lang.String[]{ jsonFile , org.toradocu.util.GoalFileConverterTest.getGoalFilePath(jsonFile) , binDir , expectedOutput };
    try {
        org.toradocu.util.GoalFileConverter.main(args);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        org.junit.Assert.fail("Error in the conversion!");
    }
}