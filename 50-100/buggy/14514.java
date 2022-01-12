@org.junit.Test
public void testGetStakeHolder() throws eis.exceptions.ManagementException {
    java.util.Map<java.lang.String, eis.iilang.Parameter> parameters = new java.util.HashMap<java.lang.String, eis.iilang.Parameter>();
    parameters.put("map", tygronenv.TestEnvironment.MAP);
    parameters.put("stakeholder", new eis.iilang.Identifier("MUNICIPALITY"));
    env.init(parameters);
    env.kill();
}