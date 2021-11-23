@org.junit.Test(expected = qbranch.exceptions.UnsupportedBondTypeException.class)
public void testThrowExceptionOnBadClass() throws qbranch.exceptions.UnsupportedBondTypeException {
    qbranch.Deserializer deserializer = new qbranch.Deserializer<qbranch.mocks.InvalidBondGenerated>(qbranch.mocks.InvalidBondGenerated.class);
}