@org.jvnet.hudson.test.Issue(value = "JENKINS-40657")
@org.junit.Test
public void libraryObjectInScript() throws java.lang.Exception {
    expect("libraryObjectInScript").logContains("hello").go();
}