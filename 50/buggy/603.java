@org.junit.Before
public void setUp() throws java.io.IOException {
    fooFile = folder.newFile("Foo.groovy");
    copyIntoFile("/Foo.groovy", fooFile);
}