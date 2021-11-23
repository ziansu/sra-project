@org.junit.Test(expected = qbranch.exceptions.UnsupportedBondTypeException.class)
public void testThrowExceptionOnBadClass() throws qbranch.exceptions.UnsupportedBondTypeException {
    qbranch.Deserializer<qbranch.mocks.InvalidBondGenerated> deserializer = new qbranch.Deserializer(qbranch.mocks.InvalidBondGenerated.class);
}