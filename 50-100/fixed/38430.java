@org.testng.annotations.Test(description = "Test null value of a connector", enabled = false)
public void testConnectorNull() {
    org.ballerinalang.model.values.BValue[] vals = org.ballerinalang.test.utils.BTestUtils.invoke(positiveCompileResult, "testConnectorNull", new org.ballerinalang.model.values.BValue[]{  });
    org.testng.Assert.assertEquals(vals[0], null);
    org.testng.Assert.assertEquals(vals[1], null);
    org.testng.Assert.assertEquals(vals[2], new org.ballerinalang.model.values.BInteger(8));
}