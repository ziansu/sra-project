public static boolean isSupportedVMNodeType(javax.xml.namespace.QName nodeType) {
    if (nodeType.toString().equals(Types.vmNodeType.toString())) {
        return true;
    }
    return false;
}