@org.junit.Test
public void testConvertWhereCondition() {
    com.amalto.workbench.webservices.WSWhereCondition wc = new com.amalto.workbench.webservices.WSWhereCondition("Entity/Id", com.amalto.workbench.webservices.WSWhereOperator.CONTAINS, "id1", com.amalto.workbench.webservices.WSStringPredicate.OR, false);
    java.lang.String[] lines = com.amalto.workbench.utils.Util.convertWhereCondition(wc);
    assertEquals(lines.length, 4);
    assertEquals(lines[0], "Entity/Id");
    assertEquals(lines[1], "Contains");
    assertEquals(lines[2], "id1");
    assertEquals(lines[3], "Or");
}