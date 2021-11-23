public static void main(java.lang.String[] args) {
    try {
        edu.cornell.scholars.workflow1.MainEntryPoint_WorkFlow1.init("resources/setup.properties");
        edu.cornell.scholars.journalsubjectareamapper.JournalToSubjectAreaMapEntryPoint jrnlep = new edu.cornell.scholars.journalsubjectareamapper.JournalToSubjectAreaMapEntryPoint();
        jrnlep.runProcess();
    } catch (java.security.NoSuchAlgorithmException | java.io.IOException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}