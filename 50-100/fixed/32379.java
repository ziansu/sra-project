@org.junit.Test
public void testInsertPlan() {
    edu.fudan.ooad.entity.Plan p = new edu.fudan.ooad.entity.Plan("p1", edu.fudan.ooad.test.PlanTest.type.getId(), 30, "small", "testing");
    edu.fudan.ooad.operation.BaseOperation.insert(p);
    junit.framework.TestCase.assertNotNull("failure in plan insertion", edu.fudan.ooad.operation.BaseOperation.query(edu.fudan.ooad.entity.Plan.class, p.getId()));
    org.junit.Assert.assertEquals("failure in plan insertion", 1, edu.fudan.ooad.operation.BaseOperation.queryAll(edu.fudan.ooad.entity.Plan.class).size());
    edu.fudan.ooad.operation.BaseOperation.delete(p);
}