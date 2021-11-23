@org.junit.Test(expected = hillbillies.model.IllegalNameException.class)
public void constructor_Illegal_NameLength() throws hillbillies.model.IllegalNameException, hillbillies.model.IllegalPositionException {
    new hillbillies.model.Unit(UnitTest.ValidLocation, "T", 0, 0, 0, 0, 0, 0, 0);
}