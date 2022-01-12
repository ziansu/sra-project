@org.junit.After
public void after() throws java.lang.Exception {
    if (((johndoe) != null) && (johndoe.isLoggedIn())) {
        sampleApp1.casLogout(johndoe);
    }
    johndoe.close();
    if (((janedoe) != null) && (janedoe.isLoggedIn())) {
        sampleApp2.casLogout(janedoe);
    }
    janedoe.close();
}