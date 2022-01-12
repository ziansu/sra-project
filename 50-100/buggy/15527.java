@org.junit.Test
public void theUserReceiveABadQualificationTwoTimesThenYourPointsDecreaseAt1000() {
    unq.tpi.desapp.grupof.model.BadQualification badQualification = org.mockito.Mockito.mock(unq.tpi.desapp.grupof.model.BadQualification.class);
    org.mockito.Mockito.when(badQualification.getPoints()).thenReturn((-1000));
    unq.tpi.desapp.grupof.model.User anUser = new unq.tpi.desapp.grupof.model.builder.UserPassengerBuilder().withScore(2500).build();
    anUser.receiveABadQualification(badQualification);
    anUser.receiveABadQualification(badQualification);
    org.junit.Assert.assertEquals(1500, anUser.getScore());
}