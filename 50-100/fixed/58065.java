@org.junit.jupiter.api.Test
void testThatShowColorSetsColorForEachPin() {
    controller.showColor(new com.dibbledos.piRGB.rest.entities.Color(0, 0, 0, 0), false);
    verify(lightSystem).setPinPercentage(ColorPin.BLUE, 0);
    verify(lightSystem).setPinPercentage(ColorPin.GREEN, 0);
    verify(lightSystem).setPinPercentage(ColorPin.RED, 0);
}