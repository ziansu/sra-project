@org.junit.jupiter.api.Test
void testThatShowColorRespectsColorMagnitude0() {
    controller.showColor(new com.dibbledos.piRGB.rest.entities.Color(255, 255, 255, 0), false);
    org.mockito.Mockito.verify(lightSystem).setPinPercentage(ColorPin.BLUE, 0);
    org.mockito.Mockito.verify(lightSystem).setPinPercentage(ColorPin.GREEN, 0);
    org.mockito.Mockito.verify(lightSystem).setPinPercentage(ColorPin.RED, 0);
}