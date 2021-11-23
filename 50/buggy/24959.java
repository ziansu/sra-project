@org.junit.Test
public void constructor_Legal_Name() throws hillbillies.model.IllegalNameException, hillbillies.model.IllegalPositionException {
    new hillbillies.model.Unit(UnitTest.ValidLocation, UnitTest.ValidName, 0, 0, 0, 0, 0, 0, 0);
}