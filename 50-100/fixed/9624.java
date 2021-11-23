@org.junit.Test
public void theUserReceiveAGoodQualificationThenYourPointsIncreaseAt500() {
    unq.tpi.desapp.grupof.model.GoodQualification goodQualification = mock(unq.tpi.desapp.grupof.model.GoodQualification.class);
    when(goodQualification.getPoints()).thenReturn(500);
    unq.tpi.desapp.grupof.model.User anUser = new unq.tpi.desapp.grupof.model.builder.UserDriverBuilder().build();
    anUser.receiveAGoodQualification(goodQualification);
    org.junit.Assert.assertEquals(600, anUser.getScore());
}