public static boolean verifyCertificatesExist(java.lang.String dockerCertPath) {
    java.lang.String[] files = new java.lang.String[]{ "ca.pem" , "cert.pem" , "key.pem" };
    boolean result = true;
    for (java.lang.String file : files) {
        java.io.File path = new java.io.File(dockerCertPath, file);
        result &= path.exists();
    }
    return result;
}