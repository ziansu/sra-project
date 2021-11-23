@org.junit.Test
public void testMasterData() throws java.lang.Exception {
    generateCollection();
    java.lang.String[] masterDataLabels = new java.lang.String[]{ org.gradoop.flink.datagen.transactions.foodbroker.config.FoodBrokerConstants.EMPLOYEE_VERTEX_LABEL , org.gradoop.flink.datagen.transactions.foodbroker.config.FoodBrokerConstants.CUSTOMER_VERTEX_LABEL , org.gradoop.flink.datagen.transactions.foodbroker.config.FoodBrokerConstants.VENDOR_VERTEX_LABEL , org.gradoop.flink.datagen.transactions.foodbroker.config.FoodBrokerConstants.LOGISTICS_VERTEX_LABEL , org.gradoop.flink.datagen.transactions.foodbroker.config.FoodBrokerConstants.PRODUCT_VERTEX_LABEL };
    for (java.lang.String label : masterDataLabels) {
        long count = cases.getVertices().filter(new org.gradoop.flink.model.impl.functions.epgm.ByLabel(label)).count();
        org.junit.Assert.assertTrue((label + " vertices are missing"), (count > 0));
    }
}