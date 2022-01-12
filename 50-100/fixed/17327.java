@org.testng.annotations.Test
public void shouldSetParametersForBetweenQuery() {
    org.activejpa.entity.Condition condition = new org.activejpa.entity.Condition("key", org.activejpa.entity.Condition.Operator.between, new java.lang.Object[]{ "value1" , "value2" });
    condition.setParameters(query, new java.lang.String[]{ "value1" , "value2" });
    org.mockito.Mockito.verify(query).setParameter("fromkey", "value1");
    org.mockito.Mockito.verify(query).setParameter("tokey", "value2");
}