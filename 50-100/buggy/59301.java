public void checkActivity() {
    adminMenuStart.Caretaker c = new adminMenuStart.Caretaker();
    NewMainMapManagement.LogoutMemento lm = new NewMainMapManagement.LogoutMemento();
    synchronized(c) {
        do {
            try {
                c.wait(10);
            } catch (java.lang.InterruptedException e) {
                java.lang.System.out.println("Error waitin on yo ass");
            }
        } while (c.isM() );
        lm.autoLogout();
    }
}