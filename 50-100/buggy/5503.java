@org.junit.Test
public void testExcecutionOfRCode() throws java.io.FileNotFoundException, javax.script.ScriptException {
    com.acuo.common.model.ids.ClientId clientId = com.acuo.common.model.ids.ClientId.fromString("999");
    java.util.Set<java.lang.String> msIds = com.google.common.collect.ImmutableSet.of("msp38");
    java.lang.Double[] pref = java.util.Arrays.asList(new java.lang.Double[]{ 10.0 , 10.0 , 2.0 }).stream().collect(java.util.stream.Collectors.toList()).toArray(new java.lang.Double[0]);
    algoService.callAlgo(msIds, clientId, pref);
}