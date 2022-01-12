@org.junit.Test
public void testSetMode() {
    com.github.ricksbrown.cowsay.plugin.CowExecutor instance = new com.github.ricksbrown.cowsay.plugin.CowExecutor();
    instance.setMessage("Hello");
    java.util.Set<java.lang.String> modes = com.github.ricksbrown.cowsay.plugin.CowExecutorTest.modeMap.keySet();
    for (java.lang.String key : modes) {
        java.lang.System.out.println(("setMode " + key));
        java.lang.String expResult = com.github.ricksbrown.cowsay.CowsayTest.loadExpected(com.github.ricksbrown.cowsay.plugin.CowExecutorTest.modeMap.get(key));
        instance.setMode(key);
        java.lang.String result = instance.execute();
        org.junit.Assert.assertEquals(expResult, result);
    }
}