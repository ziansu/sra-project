private static boolean isOperator(java.lang.String op) {
    op = op.trim().toUpperCase();
    for (java.lang.String s : com.org.gnos.services.csv.GnosExpressionParser.operators) {
        if (s.equals(op))
            return true;
        
    }
    return false;
}