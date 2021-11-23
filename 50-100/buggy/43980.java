@org.junit.Before
public void setUp() throws java.lang.Exception {
    emailSender = mock(no.java.moosehead.saga.EmailSender.class);
    no.java.moosehead.controller.SystemSetup setup = mock(no.java.moosehead.controller.SystemSetup.class);
    when(setup.emailSender()).thenReturn(emailSender);
    no.java.moosehead.controller.SystemSetup.setSetup(setup);
    java.util.Map<java.lang.String, java.lang.String> conf = new java.util.HashMap<>();
    conf.put("placesPerWorkshop", "2");
    no.java.moosehead.web.Configuration.initData(conf);
    emailSaga = new no.java.moosehead.saga.EmailSaga();
}