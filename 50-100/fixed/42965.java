public java.lang.String getRuleString() {
    java.lang.StringBuilder rule = new java.lang.StringBuilder();
    rule.append(newSymbol);
    switch (direction) {
        case turing.tape.Tape.LEFT_DIRECTION :
            rule.append(Tape.LEFT_DIRECTION_FLAG);
            break;
        case turing.tape.Tape.RIGHT_DIRECTION :
            rule.append(Tape.RIGHT_DIRECTION_FLAG);
            break;
        case turing.tape.Tape.STAY_DIRECTION :
            rule.append(Tape.STAY_DIRECTION_FLAG);
            break;
    }
    rule.append(java.lang.Integer.toString(newState));
    return rule.toString();
}