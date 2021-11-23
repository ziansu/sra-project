private static void cleanOutputs() {
    try {
        if (!(pixelitor.AssertJSwingTest.cleanerScript.exists())) {
            java.lang.System.out.println("Cleaner script not found.");
            return ;
        }
        java.lang.Process process = java.lang.Runtime.getRuntime().exec(pixelitor.AssertJSwingTest.cleanerScript.getCanonicalPath());
        process.waitFor();
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}