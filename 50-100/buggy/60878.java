public boolean[] checkFilter() {
    boolean[] output = new boolean[loggerMap.size()];
    int i = 0;
    for (java.util.logging.Logger n : loggerMap.values()) {
        if ((n.getLevel()) == (java.util.logging.Level.OFF)) {
            output[i] = true;
        }else {
            output[i] = false;
        }
        i++;
    }
    return output;
}