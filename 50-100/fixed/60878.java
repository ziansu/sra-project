public boolean[] checkFilter() {
    boolean[] output = new boolean[loggerMap.size()];
    int i = 0;
    for (java.util.logging.Logger n : loggerMap.values()) {
        if ((n.getLevel()) == (java.util.logging.Level.OFF)) {
            output[i] = false;
        }else {
            output[i] = true;
        }
        i++;
    }
    return output;
}