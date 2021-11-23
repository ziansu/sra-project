public static com.damnhandy.uri.template.impl.Operator fromOpCode(java.lang.String opCode) throws java.lang.IllegalArgumentException {
    for (com.damnhandy.uri.template.impl.Operator op : com.damnhandy.uri.template.impl.Operator.values()) {
        if (op.getOperator().equalsIgnoreCase(opCode)) {
            return op;
        }else
            if ((opCode.equalsIgnoreCase("!")) || (opCode.equalsIgnoreCase("="))) {
                throw new java.lang.IllegalArgumentException((opCode + " is not a valid operator."));
            }
        
    }
    return null;
}