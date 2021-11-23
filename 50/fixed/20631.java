@org.junit.Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
public void testEndofStreet() {
    autoParker.AutoParkImpl autoPark = new autoParker.AutoParkImpl(500, false);
    autoPark.moveForward();
}