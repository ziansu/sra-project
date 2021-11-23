@org.hawk.module.annotation.SubTask(name = "setKeyStore", sequence = 1, ignoreException = false, hawkParam = "var hawkStruct")
public boolean setKeyStore(java.lang.Object... args) throws java.lang.Exception {
    java.lang.String keystoreFile = args[0].toString();
    java.lang.String password = args[1].toString();
    java.lang.System.out.println(keystoreFile);
    java.lang.System.out.println(password);
    com.jayway.restassured.RestAssured.keystore(org.hawk.module.core.HttpModule.getCertificateFile(keystoreFile).getPath(), password);
    return true;
}