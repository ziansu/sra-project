public void updateOthers() throws java.io.IOException {
    for (int i = 0; i < (ChordServer.m); i++) {
        int p = findPredecessor(((int) (((identifier) - (java.lang.Math.pow(2, i))) + 1)));
        java.lang.String msg = (("updateFingerTable " + (identifier)) + " ") + i;
        RemoteProcedureCall(p, msg);
    }
}