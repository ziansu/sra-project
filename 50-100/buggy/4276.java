static java.lang.String GENERATE_COUNTER_STRING() {
    java.lang.String result = "";
    for (int i = 0; i < (com.dqnt.amber.Debug.functionCounter.size()); i++) {
        result += (com.dqnt.amber.Debug.functionCounter.get(i)) + "\n";
    }
    return result;
}