private static void cleanOutputs() {
    try {
        java.lang.Process process = java.lang.Runtime.getRuntime().exec(pixelitor.AssertJSwingTest.cleanerScript.getCanonicalPath());
        process.waitFor();
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}