@org.junit.Test
public void testExternal() throws java.lang.Exception {
    java.lang.System.out.println(path);
    commonUtil.createFile(orgillEdiPath, "test.txt", "This is test\nedi format test".getBytes());
    java.lang.System.out.println(orgillEdiPath);
}