private java.lang.Object convertToJadeModelValue(java.lang.Object eval) {
    if (eval instanceof java.lang.Double) {
        java.lang.String s = java.lang.String.valueOf(eval);
        if (s.endsWith(".0")) {
            return java.lang.Integer.valueOf(s.substring(0, ((s.length()) - 2)));
        }
    }
    return eval;
}