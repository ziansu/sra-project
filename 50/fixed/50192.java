@org.testng.annotations.BeforeTest
public void fileExistChecker() throws java.lang.Exception {
    if (!(file.exists())) {
        java.lang.System.out.println(file);
        throw new java.lang.Exception("Base file not found");
    }
}