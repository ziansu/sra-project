public void testConnectorCreationCreateKeyword() {
    myFixture.addFileToProject("org/test/con.bal", "connector TestConnector{}");
    doTest("import org.test; function A(){ test:TestConnector c = <caret> test:TestConnector() }", "create", "A", "c", "test");
}