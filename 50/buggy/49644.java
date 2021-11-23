@org.jvnet.hudson.test.Issue(value = "JENKINS-43035")
@org.junit.Test
public void libraryDirectiveObjectInWhenExpression() throws java.lang.Exception {
    prepLibraryObjectRepo();
    expect("libraryDirectiveObjectInWhenExpression").logContains("hello", "apple: red", "banana: yellow", "one static", "two static", "three static").go();
}