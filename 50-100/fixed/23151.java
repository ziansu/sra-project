@org.junit.Test
public void positiveTest_deletePartSteps() throws java.sql.SQLException {
    int partStepId = 1;
    DBLayer.OrderDB orderDB = new DBLayer.OrderDB();
    ModelLayer.Order order = orderDB.findOrder(1);
    java.util.List<ModelLayer.PartStep> steps = order.getPartStepList();
    java.lang.Boolean found = false;
    int i = 0;
    while (!found) {
        ModelLayer.PartStep po = steps.get(i);
        if ((po.getId()) == partStepId) {
            orderDB.deletePartSteps(partStepId);
            found = true;
        }
    } 
}