@org.junit.Test
public void testConditionOrdering() {
    java.util.List<com.brotherlogic.discogs.Condition> conds = new java.util.LinkedList<com.brotherlogic.discogs.Condition>();
    conds.add(Condition.NM);
    conds.add(Condition.P);
    java.util.Collections.sort(conds);
    org.junit.Assert.fail();
    org.junit.Assert.assertEquals(Condition.NM, conds.get(0));
    org.junit.Assert.assertEquals(Condition.P, conds.get(1));
}