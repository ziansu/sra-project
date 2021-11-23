@org.junit.Test
public void aDrone_WhenAskToStartNextDelivery_ShouldSetTheCurrentDeliveryStatusAtDoing() {
    aDrone.startNextDelivery();
    aDrone.getCurrentDelivery();
    org.mockito.Mockito.verify(aDelivery).doing();
}