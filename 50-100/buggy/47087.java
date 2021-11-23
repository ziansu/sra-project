public void updateOthers() throws java.io.IOException {
    java.lang.System.out.println("In updateOthers");
    for (int i = 0; i < (ChordServer.m); i++) {
        int p = findPredecessor(((int) (((identifier) - (java.lang.Math.pow(2, i))) + 1)));
        java.lang.System.out.println(("p " + p));
        java.lang.String msg = (("updateFingerTable " + (identifier)) + " ") + i;
        RemoteProcedureCall(p, msg);
    }
}