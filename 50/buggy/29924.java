private void checkParameters() {
    for (org.h2.expression.ParameterInterface p : parameters) {
        if ((cmdType) != (EXPLAIN))
            p.checkSet();
        
    }
}