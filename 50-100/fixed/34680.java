@org.junit.Test
public void theUserReceiveABadQualificationOneTimeThenYourPointsNotBeModified() {
    unq.tpi.desapp.grupof.model.BadQualification badQualification = mock(unq.tpi.desapp.grupof.model.BadQualification.class);
    when(badQualification.getPoints()).thenReturn((-1000));
    unq.tpi.desapp.grupof.model.User anUser = new unq.tpi.desapp.grupof.model.builder.UserPassengerBuilder().build();
    anUser.receiveABadQualification(badQualification);
    org.junit.Assert.assertEquals(100, anUser.getScore());
}