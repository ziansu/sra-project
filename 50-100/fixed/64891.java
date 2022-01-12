@org.junit.runners.Parameterized.Parameters
public static java.util.Collection<java.lang.Object[]> generateParameters() {
    return java.util.Arrays.asList(new java.lang.Object[][]{ new java.lang.Object[]{ org.apache.tajo.plan.logical.NodeType.INSERT , false } , new java.lang.Object[]{ org.apache.tajo.plan.logical.NodeType.INSERT , true } , new java.lang.Object[]{ org.apache.tajo.plan.logical.NodeType.CREATE_TABLE , false } , new java.lang.Object[]{ org.apache.tajo.plan.logical.NodeType.CREATE_TABLE , true } });
}