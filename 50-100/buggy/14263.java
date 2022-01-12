@org.junit.Ignore
@org.junit.Test
public void testGetFile() throws java.lang.Exception {
    if (dk.kb.yggdrasil.utils.TravisUtils.runningOnTravis()) {
        return ;
    }
    java.io.File okConfigFile = new java.io.File(dk.kb.yggdrasil.BitrepositoryTest.OK_YAML_BITMAG_FILE);
    dk.kb.yggdrasil.Bitrepository br = new dk.kb.yggdrasil.Bitrepository(okConfigFile);
    java.io.File fr = br.getFile("helloworld.txt", "books");
    byte[] payloadReturned = getPayload(fr);
    java.lang.String helloWorldReturned = new java.lang.String(payloadReturned, "UTF-8");
    org.junit.Assert.assertEquals("Hello World", helloWorldReturned);
}