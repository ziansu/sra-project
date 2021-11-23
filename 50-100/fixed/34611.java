private static boolean evalAttrType(org.opends.server.types.AttributeType attrType, boolean allAttrs, java.util.HashSet<org.opends.server.types.AttributeType> attrs, org.opends.server.authorization.dseecompat.EnumTargetOperator op) {
    boolean ret = allAttrs || (attrs.contains(attrType));
    if ((allAttrs || (!(attrs.isEmpty()))) && (op.equals(EnumTargetOperator.NOT_EQUALITY))) {
        return !ret;
    }
    return ret;
}