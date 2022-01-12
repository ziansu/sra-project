@org.junit.Test
public void Test2() {
    result = tr.readFile("src\\test\\resources\\Header\\Incorrect bigconst E.tif");
    org.junit.Assert.assertEquals(0, result);
    org.junit.Assert.assertEquals(false, tr.getValidation().correct);
    to = tr.getModel();
    org.junit.Assert.assertEquals(null, to.getMetadata());
}