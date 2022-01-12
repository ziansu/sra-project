public boolean compareStem(org.overture.interpreter.traces.CallSequence other, int upto) {
    int i = 0;
    for (int count = 0; count < upto;) {
        if (i >= (size())) {
            return false;
        }
        if (!(compareItem(other, i))) {
            return false;
        }
        if (!((get(i)) instanceof org.overture.interpreter.traces.TraceVariableStatement)) {
            count++;
        }
        i++;
    }
    return true;
}