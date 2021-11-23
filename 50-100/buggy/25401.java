public synchronized java.util.Collection<org.sosy_lab.cpachecker.cpa.arg.ARGState> getResult() throws java.lang.InterruptedException {
    try {
        if ((numSetResults) != (max)) {
            wait();
        }
        if (!(success)) {
            return null;
        }else {
            return returnNodes;
        }
    } finally {
        numSetResults = 0;
        returnNodes = new java.util.ArrayList<>();
    }
}