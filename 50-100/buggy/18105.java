@org.junit.Test
public void testGetStakeHolder() throws eis.exceptions.ManagementException {
    java.util.Map<java.lang.String, eis.iilang.Parameter> parameters = new java.util.HashMap<java.lang.String, eis.iilang.Parameter>();
    java.lang.System.out.println(parameters.toString());
    parameters.put(tygronenv.TestEnvironment.PROJECT, tygronenv.TestEnvironment.PROJECTNAME);
    parameters.put(tygronenv.TestEnvironment.STAKEHOLDERS, new eis.iilang.ParameterList(new eis.iilang.Identifier(tygronenv.TestEnvironment.MUNICIPALITY)));
    env.init(parameters);
}