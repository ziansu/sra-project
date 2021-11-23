@org.junit.Test(expected = hillbillies.model.IllegalPositionException.class)
public void constructor_Illegal_OutOfWorld_Neg() throws hillbillies.model.IllegalNameException, hillbillies.model.IllegalPositionException {
    java.util.List<java.lang.Double> location = new java.util.ArrayList<java.lang.Double>();
    location.add(((double) (10)));
    location.add(((double) (10)));
    location.add(((double) (-0.001)));
    new hillbillies.model.Unit(location, UnitTest.ValidName, 0, 0, 0, 0, 0, 0, 0);
}