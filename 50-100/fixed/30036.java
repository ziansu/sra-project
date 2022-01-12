@org.testng.annotations.Test(dataProvider = "targetAttrData")
public void testTargetAttrStrings(java.lang.String eqOperator, java.lang.String targetAttrString, java.lang.String attribute, boolean expectedResult) throws java.lang.Exception {
    org.opends.server.authorization.dseecompat.EnumTargetOperator op = org.opends.server.authorization.dseecompat.EnumTargetOperator.createOperator(eqOperator);
    org.opends.server.authorization.dseecompat.TargetAttr targetAttr = org.opends.server.authorization.dseecompat.TargetAttr.decode(op, targetAttrString);
    org.opends.server.types.AttributeType attrType = org.opends.server.core.DirectoryServer.getAttributeType(attribute);
    if (attrType == null) {
        attrType = org.opends.server.core.DirectoryServer.getDefaultAttributeType(attribute);
    }
    boolean res = org.opends.server.authorization.dseecompat.TargetAttr.isApplicable(attrType, targetAttr);
    org.testng.Assert.assertEquals(res, expectedResult);
}