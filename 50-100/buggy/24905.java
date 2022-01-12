protected com.acc.data.Result getTarget(java.util.Map<java.lang.Integer, com.acc.data.Result> remainingMoves, com.acc.data.Result operand, com.acc.data.Instruction instruction) {
    if ((instruction.isPhi()) && (operand.isVariable())) {
        final com.acc.data.Result result = remainingMoves.get(operand.getLocation());
        if (result != null) {
            return result;
        }
    }
    if ((operand != null) && (operand.isIntermediate())) {
        return remainingMoves.get(operand.getIntermediateLoation());
    }
    return null;
}