public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.accenture.spring.batch.util.SecurityUtil.loadSecuritySetting();
    java.lang.String inputFile = "C:\\Users\\pratibha.ghorpade\\git\\enhanced-spring-batch\\src\\test\\resources\\test.properties";
    java.lang.String outFile = "C:\\Users\\pratibha.ghorpade\\git\\enhanced-spring-batch\\src\\test\\resources\\enc_test.properties";
    java.lang.String publicKeyName = "C:\\Users\\pratibha.ghorpade\\git\\enhanced-spring-batch\\src\\test\\resources\\public.asc";
    java.lang.String keyFileName = "C:\\Users\\pratibha.ghorpade\\git\\enhanced-spring-batch\\src\\test\\resources\\Secret.asc";
    char[] ch = "12345".toCharArray();
    EncDec.decryptFile(outFile, keyFileName, ch, "dec1.out");
}