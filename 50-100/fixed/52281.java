private java.lang.String getOopFirstToAct(double handStrengthAgainstRange) {
    if (handStrengthAgainstRange > 0.6) {
        return getValueAction(BET, CHECK);
    }
    java.lang.String drawAction = getDrawAction(BET);
    if (drawAction != null) {
        return drawAction;
    }else {
        return getBluffAction(BET, CHECK, handStrengthAgainstRange);
    }
}