@org.junit.Test
public void convertShouldSucceed() throws command.ValidateException, java.io.IOException, java.lang.InterruptedException {
    java.lang.String res = process.Pyicos.runConvert(process.test.PyicosTest.inSamFile.getCanonicalPath(), process.test.PyicosTest.outWigFile.getCanonicalPath());
    assertTrue(process.test.PyicosTest.outWigFile.exists());
    assertTrue(new java.io.File(res).exists());
}