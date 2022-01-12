@org.junit.Test
public void Generic3BitCrcTest2() throws java.lang.Exception {
    java.lang.Integer[] buffer = new java.lang.Integer[]{ 1 , 2 , 3 };
    Utility.Crc.CrcGeneric crcGeneric = new Utility.Crc.CrcGeneric(3, ((long) (3)), ((long) (0)), ((long) (0)), false, false);
    for (java.lang.Integer dataByte : buffer) {
        crcGeneric.update(dataByte);
    }
    org.junit.Assert.assertEquals(5, crcGeneric.getValue());
}