public int findPredecessor(int id) throws java.io.IOException {
    int nPrime = identifier;
    int nPrimeSuccessor = getSuccessor();
    java.lang.String msg;
    while (!(isInRange(id, nPrime, nPrimeSuccessor, false, true))) {
        msg = "closestPrecedingFinger " + id;
        nPrime = RemoteProcedureCall(nPrime, msg);
        msg = "getSuccessor";
        nPrimeSuccessor = RemoteProcedureCall(nPrime, msg);
    } 
    return nPrime;
}