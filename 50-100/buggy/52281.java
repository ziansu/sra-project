private java.lang.String getOopFirstToAct(double handStrengthAgainstRange) {
    if (myLastActionWasCall()) {
        return CHECK;
    }else {
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
}