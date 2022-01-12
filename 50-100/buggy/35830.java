@org.junit.Before
public void setUpClass() throws java.lang.Exception {
    java.lang.String args = "dev";
    if ((java.lang.System.getenv("CHITCHAT_ENV").length()) > 0) {
        args = java.lang.System.getenv("CHITCHAT_ENV");
    }
    org.testfx.framework.junit.ApplicationTest.launch(com.moc.chitchat.Main.class, args);
}