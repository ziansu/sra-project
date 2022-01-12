@org.junit.Test
public void testReviewSelectProgramSlot() throws java.lang.Exception {
    java.lang.System.out.println("reviewSelectProgramSlot");
    scheduleDelegate.processCreateProgramSlot(programSlot);
    sg.edu.nus.iss.phoenix.schedule.entity.ProgramSlot expUser = instance.reviewSelectProgramSlot().get(0);
    org.mockito.Mockito.verify(instance.reviewSelectProgramSlot().get(0));
    assertNotNull(expUser);
}