@org.junit.jupiter.api.Test
void testThatShowColorRespectsColorMagnitude100() {
    controller.showColor(new com.dibbledos.piRGB.rest.entities.Color(255, 255, 255, 100), false);
    org.mockito.Mockito.verify(lightSystem).setPinPercentage(ColorPin.BLUE, 100);
    org.mockito.Mockito.verify(lightSystem).setPinPercentage(ColorPin.GREEN, 100);
    org.mockito.Mockito.verify(lightSystem).setPinPercentage(ColorPin.RED, 100);
}