@org.junit.Test
public void constructorTest() {
    org.junit.Assert.assertEquals(("Antall Kort skal være " + (ANTALL_KORT)), ANTALL_KORT, kortStokk.getList().size());
}