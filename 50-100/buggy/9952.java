private static boolean licenseFileExists() {
    java.io.File licenseFile = new java.io.File(org.eclipse.titan.regressiontests.MainTestSuite.LICENSE_FILE);
    if (licenseFile.exists()) {
        return true;
    }
    final java.lang.String licenseFromEnv = java.lang.System.getenv("TTCN3_LICENSE_FILE");
    if (licenseFromEnv != null) {
        licenseFile = new java.io.File(licenseFromEnv);
        if (licenseFile.exists()) {
            return true;
        }
    }
    return false;
}