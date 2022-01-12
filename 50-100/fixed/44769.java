public void updateFingerTable(int value, int index) throws java.io.IOException {
    if (isInRange(value, identifier, fingerTable.getFingerNode(index), false, false)) {
        if (index == 0) {
            setSuccessor(value);
        }
        fingerTable.setFingerNode(index, value);
        int p = predecessor;
        java.lang.String msg = (("updateFingerTable " + value) + " ") + index;
        RemoteProcedureCall(p, msg);
    }
}