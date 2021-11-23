public static boolean isApplicable(org.opends.server.types.AttributeType a, org.opends.server.authorization.dseecompat.TargetAttr targetAttr) {
    if ((targetAttr.isAllUserAttributes()) && (targetAttr.isAllOpAttributes())) {
        return !(targetAttr.getOperator().equals(EnumTargetOperator.NOT_EQUALITY));
    }else {
        return org.opends.server.authorization.dseecompat.TargetAttr.evalAttrType(a, targetAttr);
    }
}