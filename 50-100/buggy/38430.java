@org.testng.annotations.Test(description = "Test null value of a connector")
public void testConnectorNull() {
    org.ballerinalang.model.values.BValue[] vals = org.ballerinalang.test.utils.BTestUtils.invoke(positiveCompileResult, "testConnectorNull", new org.ballerinalang.model.values.BValue[]{  });
    org.testng.Assert.assertEquals(vals[0], null);
    org.testng.Assert.assertEquals(vals[1], null);
    org.testng.Assert.assertEquals(((org.ballerinalang.model.values.BInteger) (vals[2])).intValue(), 8);
}