public java.lang.String evaluate(java.lang.Object information) {
    java.lang.Object result = org.mvel2.MVEL.executeExpression(_compiledExpression, information, new java.util.HashMap<java.lang.String, java.lang.Object>());
    if (result != null) {
        return result.toString();
    }
    return null;
}