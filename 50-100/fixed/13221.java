private static boolean evaluate(double left, java.lang.String op, double right) {
    switch (op) {
        case "==" :
            return left == right;
        case ">" :
            return left > right;
        case "<" :
            return left < right;
        case "<=" :
            return left <= right;
        case ">=" :
            return left >= right;
        case "!=" :
            return left != right;
        default :
            java.lang.System.err.println(("ERROR: Operator type not recognized." + op));
            return false;
    }
}