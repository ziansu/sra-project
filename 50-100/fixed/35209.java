private int nextFreeAddr(com.microrisc.simply.iqrf.dpa.v210.types.BondedNodes bondedNodes, int from) throws java.lang.Exception {
    int origAddr = from;
    for (; ;) {
        if ((++from) > (DPA_ProtocolProperties.NADR_Properties.IQMESH_NODE_ADDRESS_MAX)) {
            from = 1;
        }
        if (!(bondedNodes.isBonded(from))) {
            return from;
        }
        if (origAddr == from) {
            throw new java.lang.Exception("NextFreeAddr: no free address");
        }
    }
}