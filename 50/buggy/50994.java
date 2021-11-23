@java.lang.Override
protected void setUp() throws java.lang.Exception {
    helper.setUp();
    ofyService = com.googlecode.objectify.ObjectifyService.begin();
    com.googlecode.objectify.ObjectifyService.register(com.ase_server.model.user.StudentImpl.class);
    com.googlecode.objectify.ObjectifyService.register(com.ase_server.model.user.TutorImpl.class);
    com.googlecode.objectify.ObjectifyService.register(com.ase_server.model.user.GroupImpl.class);
}