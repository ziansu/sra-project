@org.junit.Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
public void testBeginningofStreet() {
    autoParker.AutoParkImpl autoPark = new autoParker.AutoParkImpl();
    autoPark.moveBackward(autoPark.getPositionStatus());
}