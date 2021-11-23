public static boolean isSupportedVMNodeType(javax.xml.namespace.QName nodeType) {
    if (nodeType.toString().equals(Types.vmNodeType)) {
        return true;
    }
    return false;
}