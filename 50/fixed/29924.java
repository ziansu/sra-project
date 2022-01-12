private void checkParameters() {
    if ((cmdType) != (EXPLAIN)) {
        for (org.h2.expression.ParameterInterface p : parameters) {
            p.checkSet();
        }
    }
}