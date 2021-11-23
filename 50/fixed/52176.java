@org.junit.After
public void tearDown() {
    com.thoughtworks.go.config.GuidService.deleteGuid();
}