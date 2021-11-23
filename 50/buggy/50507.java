@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    getActivity();
    android.support.test.espresso.Espresso.closeSoftKeyboard();
    if ((com.parse.ParseUser.getCurrentUser()) == null) {
        com.parse.ParseUser.logIn("TestUser", "1234");
    }
}