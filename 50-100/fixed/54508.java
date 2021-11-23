@org.junit.Test(expected = hillbillies.model.IllegalPositionException.class)
public void constructor_Illegal_OutOfWorld_Neg() throws hillbillies.model.IllegalNameException, hillbillies.model.IllegalPositionException {
    java.util.List<java.lang.Integer> location = new java.util.ArrayList<java.lang.Integer>();
    location.add(10);
    location.add(10);
    location.add((-1));
    new hillbillies.model.Unit(location, UnitTest.ValidName, 0, 0, 0, 0);
}