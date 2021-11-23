@org.testng.annotations.BeforeTest
public void fileExistChecker() throws java.lang.Exception {
    if (!(file.exists())) {
        throw new java.lang.Exception("Base file not found");
    }
}