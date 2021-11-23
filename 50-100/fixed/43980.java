@org.junit.Before
public void setUp() throws java.lang.Exception {
    emailSender = mock(no.java.moosehead.saga.EmailSender.class);
    no.java.moosehead.controller.SystemSetup setup = mock(no.java.moosehead.controller.SystemSetup.class);
    when(setup.emailSender()).thenReturn(emailSender);
    no.java.moosehead.controller.SystemSetup.setSetup(setup);
    emailSaga = new no.java.moosehead.saga.EmailSaga();
}