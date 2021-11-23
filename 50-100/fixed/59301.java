public void checkActivity() throws java.lang.InterruptedException {
    adminMenuStart.Caretaker c = new adminMenuStart.Caretaker();
    NewMainMapManagement.LogoutMemento lm = new NewMainMapManagement.LogoutMemento();
    synchronized(c) {
        do {
            c.wait(10);
        } while (c.isM() );
        lm.autoLogout();
    }
}