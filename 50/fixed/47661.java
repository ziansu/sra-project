@org.testng.annotations.Test
public void testStringToVarAssignment() {
    org.ballerinalang.model.values.BValue[] returns = org.ballerinalang.util.program.BLangFunctions.invokeNew(bLangProgram, "testStringToVarAssignment", new org.ballerinalang.model.values.BValue[]{  });
    org.testng.Assert.assertEquals(((org.ballerinalang.model.values.BString) (returns[0])).stringValue(), "name");
}