public static boolean isApplicable(org.opends.server.types.AttributeType a, org.opends.server.authorization.dseecompat.TargetAttr targetAttr) {
    boolean ret;
    if ((targetAttr.isAllUserAttributes()) && (targetAttr.isAllOpAttributes())) {
        ret = !(targetAttr.getOperator().equals(EnumTargetOperator.NOT_EQUALITY));
    }else
        ret = org.opends.server.authorization.dseecompat.TargetAttr.evalAttrType(a, targetAttr);
    
    return ret;
}